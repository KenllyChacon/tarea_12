package com.uce.edu.ec.proyecto_u3_pw_kc.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estu_id")
    @SequenceGenerator(name= "seq_estu_id", sequenceName = "seq_estu_id", allocationSize = 1)
    @Column(name = "estu_id")
    private Integer id;

     @Column(name = "estu_nombre")
    private String nombre;

     @Column(name = "estu_apellido")
    private String apellido;

     @Column(name = "estu_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

     @Column(name = "estu_salario")
    private BigDecimal salario;

    //GET Y SET
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
