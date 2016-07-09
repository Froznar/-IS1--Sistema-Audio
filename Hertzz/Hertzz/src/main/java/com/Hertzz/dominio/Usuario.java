package com.Hertzz.dominio;


import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
/*@DiscriminatorColumn(
		name = "USER_TYPE",
		discriminatorType= DiscriminatorType.STRING
		)*/
public class Usuario{
	@Id
	@SequenceGenerator(name = "Usuario_ID_GENERATOR", sequenceName = "Usuario_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Usuario_ID_GENERATOR")	

	private Integer Usuario_id;
	public String Nombre_usuario;
	public String Nombre_completo;
	public String Correo_electronico;
	public String Contrasenha;
	public Integer Popularidad;
	
	@OneToMany(mappedBy = "playlist_id")
	private List<Playlist> Playlists;
	
	@ManyToMany
	@JoinTable(name = "Usuario_seguidores",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Seguidor_ID", referencedColumnName = "Usuario_id"))
	private List<Usuario> Seguidores;
	
	@ManyToMany
	@JoinTable(name = "Usuario_siguiendo",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Siguiendo_ID", referencedColumnName = "Usuario_id"))
	public List<Usuario> Siguiendo;
	
	@ManyToMany
	@JoinTable(name = "Usuario_Cancion",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Cancion_ID", referencedColumnName = "ID"))
	private List<Cancion>Historial;
	
	public Usuario(){};
	public Usuario(String m_user, String Name,String Mail,String Password){
		Nombre_usuario=m_user;
		Nombre_completo=Name;
		Popularidad = 0;
		setCorreo_electronico(Mail);
		setContrasenha(Password);
	}
	public List<Usuario> get_siguiendo(){
		return this.Siguiendo;
	}
	public List<Usuario> get_seguidores(){
		return this.Seguidores;
	}
	public Usuario buscar(List<Usuario> usuarios, Usuario usuario){
		for(Usuario i : usuarios){
			if(i == usuario) return usuario;
		}
		return null;
	}
	public void delete_siguiendo(Usuario usuario){
		int index = 0;
		for(int i = 0; i < Siguiendo.size(); i++){
			if(Siguiendo.get(i) == usuario) {index = i;}
		}
		Siguiendo.remove(index);
	}
	public void add_siguiendo(Usuario usuario){
		Siguiendo.add(usuario);
	}
	public String getContrasenha() {
		return Contrasenha;
	}
	public void setContrasenha(String contrasenha) {
		Contrasenha = contrasenha;
	}
	public String getCorreo_electronico() {
		return Correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		Correo_electronico = correo_electronico;
	}

}