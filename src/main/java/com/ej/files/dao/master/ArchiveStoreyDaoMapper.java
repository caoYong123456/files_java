package com.ej.files.dao.master;

import com.ej.files.entity.master.ArchiveBox;
import com.ej.files.entity.master.ArchiveStorey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArchiveStoreyDaoMapper {

    List<ArchiveStorey> getList(ArchiveStorey archiveStorey);

    void save(ArchiveStorey archiveStorey);

    void update(ArchiveStorey archiveStorey);

    void delete(String id);

}
