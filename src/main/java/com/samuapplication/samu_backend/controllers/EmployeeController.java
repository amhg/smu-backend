package com.samuapplication.samu_backend.controllers;

import com.samuapplication.samu_backend.dto.EmployeeDto;
import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.model.login.LoginMessage;
import com.samuapplication.samu_backend.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @PostMapping("/loginOld")
    public ResponseEntity<?> loginEmployee(@RequestBody LoginDto loginDto)
    {
        LoginMessage loginResponse = employeeService.loginEmployee(loginDto);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable long id){
        EmployeeDto employeeDto = employeeService.getById(id);

        if(employeeDto == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }

    @GetMapping("/employee")
    public ResponseEntity<EmployeeDto> getEmployeeByUsername(@RequestParam String username){
        EmployeeDto employeeDto = employeeService.getEmployeeByUsername(username);

        if(employeeDto == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
    }
}
