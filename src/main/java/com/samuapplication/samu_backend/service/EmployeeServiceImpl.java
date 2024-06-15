package com.samuapplication.samu_backend.service;

import com.samuapplication.samu_backend.dto.EmployeeDto;
import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.exception.NotFoundException;
import com.samuapplication.samu_backend.mapper.EmployeeMapper;
import com.samuapplication.samu_backend.model.employee.Employee;
import com.samuapplication.samu_backend.model.login.LoginMessage;
import com.samuapplication.samu_backend.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeRepository employeeRepository;


    @Override public List<EmployeeDto> getAll() {

        return employeeRepository
                .findAll()
                .stream()
                .map(employee -> employeeMapper.employeeToDto(employee))
                .collect(Collectors.toList());
    }

    @Override public EmployeeDto getById(final long id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        if(employee.isPresent()){
            return employeeMapper.employeeToDto(employee.get());
        } else {
            throw new NotFoundException("Employee with id: " + id + "not found! Please give a valid id.");

        }
    }

    @Override public EmployeeDto createEmployee(final EmployeeDto employeeRequest) {
        return null;
    }

    @Override public LoginMessage loginEmployee(final LoginDto loginDto) {

        Optional<Employee> employee = employeeRepository.findOneByUsernameAndPassword(loginDto.getUsername(),
                                                                                           loginDto.getPassword());
        if(employee.isPresent()){

            return new LoginMessage("Login Success", true);
        } else {
            return new LoginMessage("Login Failed - Employee not Found", false);
        }
    }

    @Override public EmployeeDto getEmployeeByUsername(final String username) {
        Optional<Employee> employee = employeeRepository.findByUsername(username);

        if(employee.isPresent()){
            return employeeMapper.employeeToDto(employee.get());
        } else {
            throw  new NotFoundException("Employee with username " + username + "not Found");
        }
    }

}
