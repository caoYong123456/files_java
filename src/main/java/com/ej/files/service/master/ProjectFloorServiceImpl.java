package com.ej.files.service.master;

import com.ej.files.dao.master.ProjectFloorDaoMapper;
import com.ej.files.entity.master.ProjectFloor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectFloorServiceImpl implements ProjectFloorService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ProjectFloorDaoMapper projectFloorDaoMapper;


    public List<ProjectFloor> getList(ProjectFloor projectFloor){
        return projectFloorDaoMapper.getList(projectFloor);
    }

    @Override
    public void save(ProjectFloor projectFloor) {
        projectFloorDaoMapper.save(projectFloor);
    }

    @Override
    public void update(ProjectFloor projectFloor) {
        projectFloorDaoMapper.update(projectFloor);
    }

    @Override
    public void delete(String id) {
        projectFloorDaoMapper.delete(id);
    }

}
