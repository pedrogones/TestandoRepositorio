package com.pedro123.clinicalspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pedro123.clinicalspring.RepositorioPacientes.MedicoRepository;
import com.pedro123.clinicalspring.RepositorioPacientes.PacienteRepository;
import com.pedro123.clinicalspring.model.Medico;
import com.pedro123.clinicalspring.model.Paciente;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/medico")
@AllArgsConstructor

public class ControllerMedico {

  private final MedicoRepository medicoRepository;

  @GetMapping
  public List<Medico> list(){
    return medicoRepository.findAll();
  }
  @PostMapping
public ResponseEntity<Medico> create(@RequestBody Medico medico) {
    // Adicione a lógica para salvar o Medico no banco de dados
    Medico savedMedico = medicoRepository.save(medico);
    // Retorna uma resposta com o Medico recém-criado e o status 201 Created
    return new ResponseEntity<>(savedMedico, HttpStatus.CREATED);
}

public List<Medico> encontrarPorListaDeIds(List<Long> ids) {
  return medicoRepository.findAllById(ids);
}
@PostMapping("api/medico")
public ModelAndView login(){
  ModelAndView mv = new ModelAndView();
  mv.setViewName("home/login/cadastro");
  return mv;
}
@GetMapping("api/medico")
public ModelAndView cadastrar(){
  ModelAndView mv = new ModelAndView();
  mv.setViewName("home/login/cadastro");
  return mv;
}

}
