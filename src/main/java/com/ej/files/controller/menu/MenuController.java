package com.ej.files.controller.menu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ej.files.constant.AjaxResult;
import com.ej.files.entity.menu.Menu;
import com.ej.files.entity.menu.Meta;
import com.ej.files.service.menu.MenuService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/menu")
public class MenuController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public AjaxResult list(@RequestParam(value = "page",defaultValue = "1") int page,
                           @RequestParam(value = "limit",defaultValue = "10") int limit,
                           Menu menu){

        AjaxResult ajaxResult = new AjaxResult();
        HashMap map = new HashMap();
        PageHelper.offsetPage((page-1) * limit,limit);
        List<Menu> list = menuService.menuList(menu);
        logger.info("list:"+ JSON.toJSONString(list));
        PageInfo<Menu> pageInfo = new PageInfo<>(list);
        //计算总页数
        int pageNumTotal = (int) Math.ceil((double)pageInfo.getTotal()/(double)limit);
        if(page > pageNumTotal){
            PageInfo<Menu> entityPageInfo = new PageInfo<>();
            entityPageInfo.setList(new ArrayList<>());
            entityPageInfo.setTotal(pageInfo.getTotal());
            entityPageInfo.setPageNum(page);
            entityPageInfo.setPageSize(limit);
            map.put("pageInfo",entityPageInfo);
        }else {
            map.put("pageInfo",pageInfo);
        }
        ajaxResult.setCode(20000);
        ajaxResult.setMessage("成功");
        ajaxResult.setData(map);
        logger.info("responseMsg:"+ JSON.toJSONString(ajaxResult));
        return ajaxResult;
    }

    @RequestMapping(value = "/load",method = RequestMethod.GET)
    public AjaxResult menu(@RequestParam("token") String token){
        AjaxResult ajaxResult = new AjaxResult();
        List<Menu> menuListAll = new ArrayList<>();
        List<Menu> menuList = menuService.getMenuList();
        for(Menu menu:menuList){
            List<Menu> childrenMenuList = menuService.getChildrenMenuList(menu.getId());
            for(Menu childrenMenu : childrenMenuList){
                String childrenMetaStr = childrenMenu.getMetaStr();
                Map map = JSON.parseObject(childrenMetaStr, Map.class);
                Meta childrenMate = JSONObject.parseObject(JSONObject.toJSONString(map), Meta.class);
                childrenMenu.setMeta(childrenMate);
            }
            String metaMenu = menu.getMetaStr();
            Map map = JSON.parseObject(metaMenu, Map.class);
            Meta menuMate = JSONObject.parseObject(JSONObject.toJSONString(map), Meta.class);
            menu.setMeta(menuMate);
            menu.setChildren(childrenMenuList);
            menuListAll.add(menu);
        }
        ajaxResult.setCode(20000);
        ajaxResult.setMessage("成功");
        ajaxResult.setMenuList(menuListAll);
        logger.info("加载菜单:"+ JSON.toJSONString(menuListAll));
        return ajaxResult;
    }
}
