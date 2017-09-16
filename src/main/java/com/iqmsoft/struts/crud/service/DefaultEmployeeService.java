package com.iqmsoft.struts.crud.service;

import com.iqmsoft.struts.crud.dao.EmployeeDao;
import com.iqmsoft.struts.crud.dao.InMemoryEmployeeDao;
import com.iqmsoft.struts.crud.model.Employee;

import java.util.List;

public class DefaultEmployeeService implements EmployeeService {

    private EmployeeDao dao;

    public DefaultEmployeeService() {
        this.dao = new InMemoryEmployeeDao();
    }

    @Override
    public List getAllEmployees() {
        return dao.getAllEmployees();
    }

    @Override
    public void updateEmployee(Employee emp) {
        dao.update(emp);
    }

    @Override
    public void deleteEmployee(Integer id) {
        dao.delete(id);
    }

    @Override
    public Employee getEmployee(Integer id) {
        return dao.getEmployee(id);
    }

    @Override
    public void insertEmployee(Employee emp) {
        dao.insert(emp);
    }
}
