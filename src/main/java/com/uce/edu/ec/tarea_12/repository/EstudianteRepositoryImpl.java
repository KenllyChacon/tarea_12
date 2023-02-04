package com.uce.edu.ec.tarea_12.repository;

import com.uce.edu.ec.tarea_12.model.Estudiante;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

    @Override
    public Estudiante buscarEstudiantePorNombre(String nombre) {
        TypedQuery<Estudiante> miTypeQuery = (TypedQuery<Estudiante>) this.entityManager.createQuery("select g from Estudiante g where g.nombre =: nombre");
                miTypeQuery.setParameter("nombre", nombre);
                return miTypeQuery.getSingleResult();
    }

    @Override
    public Estudiante buscarEstudiantePorApellido(String apellido) {
       TypedQuery<Estudiante> miTypeQuery = (TypedQuery<Estudiante>) this.entityManager.createQuery("select g from Estudiante g where g.apellido =: apellido");
               miTypeQuery.setParameter("apellido", apellido);
               return miTypeQuery.getSingleResult();
    }

}
