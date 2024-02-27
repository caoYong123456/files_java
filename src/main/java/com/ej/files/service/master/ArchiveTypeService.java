package com.ej.files.service.master;

import com.ej.files.entity.master.ArchiveType;
import com.ej.files.entity.master.ProjectInfo;

import java.util.List;

public interface ArchiveTypeService {

    List<ArchiveType> getList(ArchiveType archiveType);

    void save(ArchiveType archiveType);

    void update(ArchiveType archiveType);

    void delete(String id);


}
