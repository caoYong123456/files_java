package com.ej.files.service.menu;

import com.ej.files.entity.menu.Menu;
import java.util.List;

public interface MenuService {

    List<Menu> menuList(Menu menu);

    List<Menu> getMenuList();

    List<Menu> getChildrenMenuList(String parentId);
}
