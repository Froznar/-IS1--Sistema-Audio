package com.Hertzz.dominio;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;

@Entity
public class Usuario{
	@Id
	@SequenceGenerator(name = "Usuario_ID_GENERATOR", sequenceName = "Usuario_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Usuario_ID_GENERATOR")	

	protected Integer Usuario_id;
	protected String Nombre_completo;
	protected String Correo_electronico;
	protected String Contrasenha;
	//public List<Playlist> Playlists;
	//public List<Usuario> Seguidores;
	//public List<Usuario> Siguiendo;
	//public List<Cancion>Historial;
	public Usuario(){};
	public Usuario(String Name,String Mail,String Password){
		Nombre_completo=Name;
		Correo_electronico=Mail;
		Contrasenha=Password;
	}

}