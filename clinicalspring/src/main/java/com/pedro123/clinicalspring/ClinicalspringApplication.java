package com.pedro123.clinicalspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pedro123.clinicalspring.RepositorioPacientes.MedicoRepository;
import com.pedro123.clinicalspring.RepositorioPacientes.PacienteRepository;
import com.pedro123.clinicalspring.model.Medico;
import com.pedro123.clinicalspring.model.Paciente;

@SpringBootApplication
public class ClinicalspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicalspringApplication.class, args);
	}

  @Bean
  CommandLineRunner initDataBase(PacienteRepository pacienteRepository, MedicoRepository medicoRepository){
    return args->{
      //inicializando um paciente:
      pacienteRepository.deleteAll();
      Paciente p = new Paciente();
      p.setName("Pedro");
      p.setAlergico("sim");
      p.setInfoadd("Nenhuma");
      p.setIdade("19");
      p.setUsuario("pedrotargino");
      p.setSenha("!@#$4");
      p.setSintomas("febre");
      pacienteRepository.save(p);


      //inicializando um medico:
      medicoRepository.deleteAll();
      Medico m = new Medico();
       m.setName("João Victore");
      m.setAlergico("sim");
      m.setContato("(83) 9916000000");
    m.setInfoadd("Médico especialista em análises Clínicas");
      m.setIdade("20");
      m.setUsuario("joaozinhoufpb");
      medicoRepository.save(m);
    };
  }

}
