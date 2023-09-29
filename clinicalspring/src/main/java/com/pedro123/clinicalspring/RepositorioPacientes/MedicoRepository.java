package com.pedro123.clinicalspring.RepositorioPacientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedro123.clinicalspring.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {


}
