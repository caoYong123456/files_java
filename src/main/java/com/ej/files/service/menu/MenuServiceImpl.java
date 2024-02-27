package com.ej.files.service.menu;

import com.ej.files.dao.menu.MenuDaoMapper;
import com.ej.files.entity.menu.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private MenuDaoMapper menuDaoMapper;

    @Override
    public List<Menu> menuList(Menu menu) {
        return menuDaoMapper.menuList(menu);
    }

    @Override
    public List<Menu> getMenuList() {
        return menuDaoMapper.getMenuList();
    }

    @Override
    public List<Menu> getChildrenMenuList(String parentId) {
        return menuDaoMapper.getChildrenMenuList(parentId);
    }

}
