package com.pedro123.clinicalspring.RepositorioPacientes;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pedro123.clinicalspring.model.Paciente;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
