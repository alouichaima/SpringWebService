package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepository employeeRepository;
@Override
public Employee getEmployeeById(long employeeId) {
Employee obj=employeeRepository.findByEmployeeId(employeeId);
return obj;
}
@Override
public void AddEmployee (Employee employee) {
employeeRepository.save(employee);
}
@Override
public void updateEmployee (Employee employee) {
employeeRepository.save (employee);
}
@Override
public void deleteEmployee (long employeeId) {
employeeRepository.deleteById(employeeId);
}

}
