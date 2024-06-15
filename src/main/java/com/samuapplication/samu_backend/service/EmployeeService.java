package com.samuapplication.samu_backend.service;

import com.samuapplication.samu_backend.dto.EmployeeDto;
import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.model.login.LoginMessage;
import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> getAll();
    EmployeeDto getById(long id);
    EmployeeDto createEmployee(EmployeeDto employeeRequest);

    LoginMessage loginEmployee(LoginDto loginDto);

    EmployeeDto getEmployeeByUsername(String username);
}
