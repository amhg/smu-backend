package com.samuapplication.samu_backend.repository;

import com.samuapplication.samu_backend.model.person.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {
    Optional<Persona> findOneByApellido1AndApellido2(String apellido1, String apellido2);

    Optional<Persona> findByRfc(String rfc);

}
