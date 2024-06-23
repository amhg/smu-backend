package com.samuapplication.samu_backend.repository;

import com.samuapplication.samu_backend.model.person.Perfil;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, String> {

    @Query(value = "Select * FROM Perfil p WHERE p.rfc = ?",
           nativeQuery = true)
    Optional<Perfil> findAreaAndPerfil(String rfc);
}
