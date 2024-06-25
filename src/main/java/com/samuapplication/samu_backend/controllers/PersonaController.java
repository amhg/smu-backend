package com.samuapplication.samu_backend.controllers;

import com.samuapplication.samu_backend.dto.LoginDto;
import com.samuapplication.samu_backend.dto.PersonaDto;
import com.samuapplication.samu_backend.model.login.PersonLoginMessage;
import com.samuapplication.samu_backend.model.person.RegistroPersonal;
import com.samuapplication.samu_backend.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {

    @Autowired PersonaServiceImpl personaService;

    @PostMapping("/login")
    public ResponseEntity<?> loginPersona(@RequestBody LoginDto loginDto)
    {
        PersonLoginMessage loginResponse = personaService.loginPersona(loginDto);
        return ResponseEntity.ok(loginResponse);
    }

    @GetMapping("/persona")
    public ResponseEntity<PersonaDto> getPersonaByRfc(@RequestParam String rfc){
        PersonaDto personaDto = personaService.getPersonaByRfc(rfc);

        if(personaDto == null){
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(personaDto, HttpStatus.OK);
    }

    @PostMapping("/persona/registroDia")
    public void registrarDia(@RequestBody RegistroPersonal registroPersonal){
        System.out.println("In Registro Dia: " + registroPersonal);
        personaService.saveRegistroPersonal(registroPersonal);
    }
}
