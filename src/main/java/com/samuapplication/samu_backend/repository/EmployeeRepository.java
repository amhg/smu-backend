package com.samuapplication.samu_backend.repository;

import com.samuapplication.samu_backend.model.employee.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findOneByUsernameAndPassword(String username, String password);

    Optional<Employee> findByUsername(String username);
}
