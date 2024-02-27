package com.ej.files.dao.master;

import com.ej.files.entity.master.ArchiveBox;
import com.ej.files.entity.master.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArchiveBoxDaoMapper {

    List<ArchiveBox> getList(ArchiveBox archiveBox);

    void save(ArchiveBox archiveBox);

    void update(ArchiveBox archiveBox);

    void delete(String id);

}
