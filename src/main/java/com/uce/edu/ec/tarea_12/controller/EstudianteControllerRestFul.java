package com.uce.edu.ec.proyecto_u3_pw_kc.controller;

import com.uce.edu.ec.proyecto_u3_pw_kc.model.Estudiante;
import com.uce.edu.ec.proyecto_u3_pw_kc.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControllerRestFul {

    @Autowired
    private IEstudianteService iEstudianteService;

    public void insertarEstudiante(Estudiante estudiante) {
    }

    @GetMapping("/buscar/{id}")
    public Estudiante buscarEstudiante(@PathVariable("id")  Integer id) {
        return this.iEstudianteService.buscarEstudiante(id);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
    }

    public void eliminarEstudiante(Integer id) {
    }

}
