package com.Hertzz.dominio;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;



@Entity

public class Playlist{
@Id
@SequenceGenerator(name = "Playlist_ID_GENERATOR", sequenceName = "Playlist_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Playlist_ID_GENERATOR")	
	private Integer playlist_id;
	private Integer usuario_id;
	public List<Cancion> Canciones_playlist;
	public String Nombre_playlist;

	public Playlist()
	{
	}
	
	public Playlist(Cancion cancion)
	{
		
	}
	
	public Playlist(Playlist playlist)
	{
		this.Canciones_playlist=playlist.Canciones_playlist;
	}
	
	public void Reproducir_aleatorio()
	{
	
	
	}

}
