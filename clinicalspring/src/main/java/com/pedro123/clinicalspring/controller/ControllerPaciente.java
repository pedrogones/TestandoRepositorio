package com.pedro123.clinicalspring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedro123.clinicalspring.RepositorioPacientes.PacienteRepository;
import com.pedro123.clinicalspring.model.Medico;
import com.pedro123.clinicalspring.model.Paciente;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/paciente")
@AllArgsConstructor

public class ControllerPaciente {

  private final PacienteRepository pacienteRepository;

  @GetMapping
  public List<Paciente> list(){
    return pacienteRepository.findAll();
  }

  @PostMapping
public ResponseEntity<Paciente> create(@RequestBody Paciente paciente) {
    // Adicione a lógica para salvar o paciente no banco de dados
    Paciente savedpaciente = pacienteRepository.save(paciente);
    // Retorna uma resposta com o paciente recém-criado e o status 201 Created
    return new ResponseEntity<>(savedpaciente, HttpStatus.CREATED);
}

}
