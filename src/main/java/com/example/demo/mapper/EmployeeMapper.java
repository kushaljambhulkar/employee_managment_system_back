package com.example.demo.mapper;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        String departmentName = null;
        if (employee.getDepartment() != null) {
            departmentName = employee.getDepartment().getName();
            System.out.println("Department Name found: " + departmentName); //Add this line
        } else {
            System.out.println("Department is null for employee ID: " + employee.getId()); //Add this line

        }
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                departmentName
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto, Department department){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                department
        );
    }
}