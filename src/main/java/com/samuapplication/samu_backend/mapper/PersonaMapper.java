package com.samuapplication.samu_backend.mapper;

import com.samuapplication.samu_backend.dto.PersonaDto;
import com.samuapplication.samu_backend.model.person.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaMapper {

    public PersonaDto personaToDTO(Persona persona){
        PersonaDto personaDto = new PersonaDto();
        personaDto.setCurp(persona.getCurp());
        personaDto.setRfc(persona.getRfc());
        personaDto.setNombre(persona.getNombre());
        personaDto.setApellido1(persona.getApellido1());
        personaDto.setApellido2(persona.getApellido2());
        return personaDto;
    }

    public Persona personaDtoToPersona(PersonaDto personaDto){
        Persona persona = new Persona();
        persona.setCurp(personaDto.getCurp());
        persona.setRfc(personaDto.getRfc());
        persona.setNombre(personaDto.getNombre());
        persona.setApellido1(personaDto.getApellido1());
        persona.setApellido2(personaDto.getApellido2());
        return persona;
    }
}
