package com.uce.edu.ec.proyecto_u3_pw_kc.repository;

import com.uce.edu.ec.proyecto_u3_pw_kc.model.Estudiante;

public interface IEstudianteRepository {

    void insertarEstudiante(Estudiante estudiante);
    Estudiante buscarEstudiante(Integer id);
    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Integer id);

}
