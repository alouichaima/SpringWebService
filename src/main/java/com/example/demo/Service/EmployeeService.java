package com.example.demo.Service;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
void AddEmployee (Employee employee);
Employee getEmployeeById(long employeeId);
void updateEmployee(Employee employee);
void deleteEmployee (long employeeId);
}
