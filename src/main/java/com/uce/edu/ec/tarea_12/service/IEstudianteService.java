package com.uce.edu.ec.proyecto_u3_pw_kc.service;

import com.uce.edu.ec.proyecto_u3_pw_kc.model.Estudiante;

public interface IEstudianteService {

    //Nombrados con terminos de negocio, registrar, borrar etc
    void insertarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Integer id);

}
