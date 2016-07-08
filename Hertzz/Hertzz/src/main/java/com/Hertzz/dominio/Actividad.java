package com.Hertzz.dominio;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;

@Entity
public class Actividad {
	@Id
	@SequenceGenerator(name = "Actividad_ID_GENERATOR", sequenceName = "Actividad_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Actividad_ID_GENERATOR")	
	private Integer Actividad_id;
	
	@ManyToOne
	@JoinColumn(name = "Usuario_id")
	private Usuario usuario_id;
	private String fecha;
	
	public Actividad(){};
}
