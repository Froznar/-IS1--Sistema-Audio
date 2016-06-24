package com.Hertzz.dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;

@Entity
public class Album {
	@Id
	@SequenceGenerator(name = "Album_ID_GENERATOR", sequenceName = "Album_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Album_ID_GENERATOR")
	private Integer idAlbum;
	private String nombreAlbum;
	
	@OneToMany(mappedBy = "album")
	  private List<Cancion> canciones;
	
	private String fechaAlbum;
	public Album(String nombre){
		this.nombreAlbum = nombre;
		this.fechaAlbum = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
	}
	public int getAlbum_id(){
		return this.idAlbum;
	}
	public String getNombreAlbum(){
		return this.nombreAlbum;
	}
	/*public List<Cancion> getCanciones_Album(){
		return this.Canciones_Album;
	}*/
	public String getFechaAlbum(){
		return this.fechaAlbum;
	}
	
	  

}
