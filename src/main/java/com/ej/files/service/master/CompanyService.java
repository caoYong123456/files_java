package com.ej.files.service.master;

import com.ej.files.entity.master.Company;
import java.util.List;

public interface CompanyService {

    List<Company> getList(Company company);

    void save(Company company);

    void update(Company company);

    void delete(String id);


}
