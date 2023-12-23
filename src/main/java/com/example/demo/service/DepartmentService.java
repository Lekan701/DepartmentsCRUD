package com.example.demo.service;

import com.example.demo.entity.Department;
import java.util.List;


public interface DepartmentService {

    // Save Operation
    Department saveDepartment(Department department);

    // Read operation
    List<Department> fetchDepartmentList();

    // Update operation
    Department updateDepartment(Department department, Long departmentId);

    // Delete operation
    void deleteDepartmentById(Long departmentId);
}
