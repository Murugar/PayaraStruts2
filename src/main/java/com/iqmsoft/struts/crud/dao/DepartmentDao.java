package com.iqmsoft.struts.crud.dao;

import java.util.List;
import java.util.Map;

import com.iqmsoft.struts.crud.model.Department;

public interface DepartmentDao {

    List<Department> getAllDepartments();

    Map<Integer, Department> getDepartmentsMap();

}
