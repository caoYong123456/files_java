package com.ej.files.service.master;

import com.ej.files.entity.master.ArchiveCabinet;

import java.util.List;

public interface ArchiveCabinetService {

    List<ArchiveCabinet> getList(ArchiveCabinet archiveCabinet);

    void save(ArchiveCabinet archiveCabinet);

    void update(ArchiveCabinet archiveCabinet);

    void delete(String id);


}
