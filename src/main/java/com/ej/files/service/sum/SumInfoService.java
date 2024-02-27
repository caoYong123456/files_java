package com.ej.files.service.sum;

import com.ej.files.entity.sum.SumInfo;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SumInfoService {

    List<SumInfo> getList(SumInfo sumInfo);

    void save(SumInfo sumInfo);

    void update(SumInfo sumInfo);

    void delete(String id);

    SumInfo findById(String id);

    void uploadFile(MultipartFile file, String sumId, String dirNum, String userId);


}
