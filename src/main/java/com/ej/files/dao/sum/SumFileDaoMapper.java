package com.ej.files.dao.sum;

import com.ej.files.entity.sum.SumFile;
import com.ej.files.entity.sum.SumInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SumFileDaoMapper {

    List<SumFile> getList(SumFile sumFile);

    void save(SumFile sumFile);

    void update(SumFile sumFile);

    void delete(String id);

    SumFile findById(String id);

}
