package com.ej.files.service.master;

import com.ej.files.entity.master.ArchiveStorey;

import java.util.List;

public interface ArchiveStoreyService {

    List<ArchiveStorey> getList(ArchiveStorey archiveStorey);

    void save(ArchiveStorey archiveStorey);

    void update(ArchiveStorey archiveStorey);

    void delete(String id);


}
