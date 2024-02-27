package com.ej.files.dao.master;

import com.ej.files.entity.master.ArchiveType;
import com.ej.files.entity.master.ProjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArchiveTypeDaoMapper {

    List<ArchiveType> getList(ArchiveType archiveType);

    void save(ArchiveType archiveType);

    void update(ArchiveType archiveType);

    void delete(String id);

}
