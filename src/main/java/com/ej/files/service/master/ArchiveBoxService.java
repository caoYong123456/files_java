package com.ej.files.service.master;

import com.ej.files.entity.master.ArchiveBox;

import java.util.List;

public interface ArchiveBoxService {

    List<ArchiveBox> getList(ArchiveBox archiveBox);

    void save(ArchiveBox archiveBox);

    void update(ArchiveBox archiveBox);

    void delete(String id);


}
