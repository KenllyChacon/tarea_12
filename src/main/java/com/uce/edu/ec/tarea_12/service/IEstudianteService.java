package com.uce.edu.ec.tarea_12.service;

import com.uce.edu.ec.tarea_12.model.Estudiante;

public interface IEstudianteService {

    //Nombrados con terminos de negocio, registrar, borrar etc
    void insertarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Integer id);

    Estudiante buscarEstudiantePorNombre(String nombre);
    Estudiante buscarEstudiantePorApellido(String apellido);
}
