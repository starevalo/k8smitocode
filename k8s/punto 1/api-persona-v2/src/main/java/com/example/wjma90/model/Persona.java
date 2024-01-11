package com.example.wjma90.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "personas")
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 2445247993956960711L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "edad", nullable = false, length = 2)
	private Integer edad;

	@Column(name = "sexo", nullable = false, length = 1)
	private String sexo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad(){
		return this.edad;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public String getSexo(){
		return this.sexo;
	}

	public void setSexo(String sexo){
		this.sexo = sexo;
	}

}
