package com.iqmsoft.struts.crud.service;

import java.util.List;

import com.iqmsoft.struts.crud.dao.DepartmentDao;
import com.iqmsoft.struts.crud.dao.InMemoryDepartmentDao;

public class DefaultDepartmentService implements DepartmentService {

    private DepartmentDao dao;

    public DefaultDepartmentService() {
        this.dao = new InMemoryDepartmentDao();
    }

    public List getAllDepartments() {
        return dao.getAllDepartments();
    }

}
