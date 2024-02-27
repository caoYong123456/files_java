package com.ej.files.dao.master;

import com.ej.files.entity.master.FileSecLevel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface FileSecLevelDaoMapper {

    List<FileSecLevel> getList(FileSecLevel fileSecLevel);

    void save(FileSecLevel fileSecLevel);

    void update(FileSecLevel fileSecLevel);

    void delete(String id);

}
