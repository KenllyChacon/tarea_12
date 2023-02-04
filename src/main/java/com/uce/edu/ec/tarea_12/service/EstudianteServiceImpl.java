package com.uce.edu.ec.proyecto_u3_pw_kc.service;

import com.uce.edu.ec.proyecto_u3_pw_kc.model.Estudiante;
import com.uce.edu.ec.proyecto_u3_pw_kc.repository.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

    //Inyeccion de dependencias
    @Autowired
    private IEstudianteRepository estudianteRepository;


    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        this.estudianteRepository.insertarEstudiante(estudiante);
    }

    @Override
    public Estudiante buscarEstudiante(Integer id) {
        return this.estudianteRepository.buscarEstudiante(id);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.estudianteRepository.actualizarEstudiante(estudiante);
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        this.estudianteRepository.eliminarEstudiante(id);
    }
}

