package com.Hertzz.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;

public class Usuario{
	  protected	int Usuario_id;
	  protected String Nombre_completo;
	  protected String Correo_electronico;
	  protected String Contrasenha;
	  public List<Playlist> Playlists = new ArrayList<Playlist>();
	  public List<Usuario> Seguidores = new ArrayList<Usuario>();
	  public List<Usuario> Siguiendo;
	  public List<Cancion>Historial;
	  public Usuario(String Name,String Mail,String Password){
	    Nombre_completo=Name;
	    Correo_electronico=Mail;
	    Contrasenha=Password;
	  }

	}