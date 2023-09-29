package com.pedro123.clinicalspring.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;

import com.pedro123.clinicalspring.Exception.CriptoExistsException;
import com.pedro123.clinicalspring.Exception.UserExistsException;
import com.pedro123.clinicalspring.RepositorioPacientes.PacienteRepository;
import com.pedro123.clinicalspring.model.Paciente;

import ch.qos.logback.classic.pattern.Util;

@org.springframework.stereotype.Service

public class ServicePaciente {

  @Autowired
    private PacienteRepository pacienteRepository;

}
