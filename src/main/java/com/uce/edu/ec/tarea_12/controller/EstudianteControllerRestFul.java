package com.uce.edu.ec.tarea_12.controller;


import com.uce.edu.ec.tarea_12.model.Estudiante;
import com.uce.edu.ec.tarea_12.service.IEstudianteService;
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

    @GetMapping("/buscarPorNombre/{nombre}")
    public Estudiante buscarEstudiantePorNombre(@PathVariable("nombre") String nombre) {
        return this.iEstudianteService.buscarEstudiantePorNombre(nombre);
    }

    @GetMapping("/buscarPorApellido/{apellido}")
    public Estudiante buscarEstudiantePorApellido(@PathVariable("apellido") String apellido) {
        return this.iEstudianteService.buscarEstudiantePorApellido(apellido);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
    }

    public void eliminarEstudiante(Integer id) {
    }

}
