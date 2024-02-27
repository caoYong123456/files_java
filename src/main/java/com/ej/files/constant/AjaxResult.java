package com.ej.files.constant;

import com.ej.files.entity.menu.Menu;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
public class AjaxResult {

    private Integer code;

    private String message;

    private HashMap data;

    private ArrayList<HashMap> dataList;

    private List<Menu> menuList;
}
