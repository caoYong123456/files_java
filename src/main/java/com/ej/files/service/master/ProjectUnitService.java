package com.ej.files.service.master;

import com.ej.files.entity.master.ProjectUnit;

import java.util.List;

public interface ProjectUnitService {

    List<ProjectUnit> getList(ProjectUnit projectUnit);

    void save(ProjectUnit projectUnit);

    void update(ProjectUnit projectUnit);

    void delete(String id);


}
