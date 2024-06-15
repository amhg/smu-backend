package com.samuapplication.samu_backend.mapper;

import com.samuapplication.samu_backend.dto.EmployeeDto;
import com.samuapplication.samu_backend.model.employee.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeMapper {

    public EmployeeDto employeeToDto(Employee employee) {
        EmployeeDto employeeToEmployeeDto = new EmployeeDto();
        employeeToEmployeeDto.setId(employee.getId());
        employeeToEmployeeDto.setFirstName(employee.getFirstName());
        employeeToEmployeeDto.setLastName(employee.getLastName());
        //mappedEmployeDto.setCategory(employee.getCategory());

        return employeeToEmployeeDto;
    }

    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        Employee mappedEmployee = new Employee();
        mappedEmployee.setFirstName(employeeDto.getFirstName());
        mappedEmployee.setLastName(employeeDto.getLastName());
        //mappedEmployee.setCategory(employeeDto.getCategory());
        return mappedEmployee;
    }
}
