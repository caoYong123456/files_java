package com.ej.files.dao.menu;

import com.ej.files.entity.menu.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MenuDaoMapper {

    List<Menu> menuList(Menu menu);

    List<Menu> getMenuList();

    List<Menu> getChildrenMenuList(@Param("parentId") String parentId);

}
