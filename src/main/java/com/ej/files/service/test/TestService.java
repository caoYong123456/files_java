package com.ej.files.service.test;

import com.ej.files.entity.test.TestEntity;

import java.util.List;

public interface TestService {

    TestEntity getById(Integer id);

    List<TestEntity> getList();

    void save(TestEntity testEntity);

    void update(TestEntity testEntity);

    void delete(Integer id);
}
