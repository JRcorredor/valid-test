package com.test.valid.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private long id ;
	
	@Column(  name ="nombre"  ,nullable = false)
	private String nombre;
	
	@Column(  name ="apellido"  ,nullable = false)
	private String apellido;
	
	@Column(  name ="procesado"  ,nullable = false)
	private Boolean procesado;

}
