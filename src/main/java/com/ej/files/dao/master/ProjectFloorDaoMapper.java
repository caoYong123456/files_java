package com.ej.files.dao.master;

import com.ej.files.entity.master.ProjectFloor;
import com.ej.files.entity.master.ProjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProjectFloorDaoMapper {

    List<ProjectFloor> getList(ProjectFloor projectFloor);

    void save(ProjectFloor projectFloor);

    void update(ProjectFloor projectFloor);

    void delete(String id);

}
