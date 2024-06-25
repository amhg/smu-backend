package com.samuapplication.samu_backend.repository;

import com.samuapplication.samu_backend.model.person.RegistroPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroPersonalRepository extends JpaRepository<RegistroPersonal, String> {


}
