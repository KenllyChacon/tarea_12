package com.uce.edu.ec.proyecto_u3_pw_kc.repository;

import com.uce.edu.ec.proyecto_u3_pw_kc.model.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertarEstudiante(Estudiante estudiante) {
        this.entityManager.persist(estudiante);
    }

    @Override
    public Estudiante buscarEstudiante(Integer id) {
        return this.entityManager.find(Estudiante.class,id);
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        this.entityManager.remove(this.buscarEstudiante(id));
    }

}
