package com.samuapplication.samu_backend.service;

import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.dto.PersonaDto;
import com.samuapplication.samu_backend.model.login.PersonLoginMessage;
import com.samuapplication.samu_backend.model.person.RegistroPersonal;

public interface PersonaService {

    PersonLoginMessage loginPersona(LoginDto loginDto);

    PersonaDto getPersonaByRfc(String rfc);

    void saveRegistroPersonal(RegistroPersonal registroPersonal);

}
