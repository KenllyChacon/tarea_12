package com.uce.edu.ec.tarea_12.service;

import com.uce.edu.ec.tarea_12.model.Estudiante;
import com.uce.edu.ec.tarea_12.repository.IEstudianteRepository;
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

    @Override
    public Estudiante buscarEstudiantePorNombre(String nombre) {
        return this.estudianteRepository.buscarEstudiantePorNombre(nombre);
    }

    @Override
    public Estudiante buscarEstudiantePorApellido(String apellido) {
        return this.estudianteRepository.buscarEstudiantePorApellido(apellido);
    }
}

