package com.ej.files.service.master;

import com.ej.files.entity.master.DeptInfo;

import java.util.List;

public interface DeptInfoService {

    List<DeptInfo> getList(DeptInfo deptInfo);

    void save(DeptInfo deptInfo);

    void update(DeptInfo deptInfo);

    void delete(String id);


}
