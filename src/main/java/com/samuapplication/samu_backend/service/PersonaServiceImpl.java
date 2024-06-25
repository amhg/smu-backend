package com.samuapplication.samu_backend.service;

import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.dto.PersonaDto;
import com.samuapplication.samu_backend.exception.NotFoundException;
import com.samuapplication.samu_backend.mapper.PersonaMapper;
import com.samuapplication.samu_backend.model.login.PersonLoginMessage;
import com.samuapplication.samu_backend.model.person.Persona;
import com.samuapplication.samu_backend.model.person.RegistroPersonal;
import com.samuapplication.samu_backend.repository.PersonaRepository;
import com.samuapplication.samu_backend.repository.RegistroPersonalRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired PersonaMapper personaMapper;
    @Autowired PersonaRepository personaRepository;

    @Autowired RegistroPersonalRepository registroPersonalRepository;

    @Override public PersonLoginMessage loginPersona(final LoginDto loginDto) {
        Optional<Persona> persona =
                personaRepository.findOneByApellido1AndApellido2(loginDto.getUsername(), loginDto.getPassword());

        return persona.map(value -> new PersonLoginMessage("Acceso Exitoso", true, value.getRfc())).orElseGet(
                () -> new PersonLoginMessage("Acceso Fallido - Usuario no Registrado", false, ""));

    }

    @Override public PersonaDto getPersonaByRfc(final String rfc) {
        Optional<Persona> persona = personaRepository.findByRfc(rfc);

        if(persona.isPresent()){
            return personaMapper.personaToDTO(persona.get());
        } else {
            throw  new NotFoundException("Usuario no encontrado");
        }

    }

    @Override public void saveRegistroPersonal(final RegistroPersonal registroPersonal) {
        registroPersonalRepository.save(registroPersonal);
    }

}
