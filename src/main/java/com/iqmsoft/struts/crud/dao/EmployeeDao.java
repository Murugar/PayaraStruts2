package com.iqmsoft.struts.crud.dao;

import java.util.List;

import com.iqmsoft.struts.crud.model.Employee;

public interface EmployeeDao {

    List getAllEmployees();

    Employee getEmployee(Integer id);

    void update(Employee emp);

    void insert(Employee emp);

    void delete(Integer id);

}
