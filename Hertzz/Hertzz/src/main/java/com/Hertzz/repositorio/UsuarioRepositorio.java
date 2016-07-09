package com.Hertzz.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;
import com.Hertzz.dominio.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
	List<Usuario> findAll();
	
	//void Seguir_Usuario(Integer usuario_id);
	//void Stop_Seguir_Usuario(Integer usuario_id);
	//void Agregar_Playlist(Playlist playlist);
	//void Agregar_Cancion(Integer cancion_id, Integer playlist_id);
	//bool Crear_playlist(String nombre);
	
	@Query("SELECT c FROM Usuario c WHERE c.Nombre_usuario = ?1 AND c.Contrasenha = ?2")
	Usuario login_usuario(String usuario, String contrasenha);
	
	@Query("SELECT c FROM Usuario c WHERE c.Nombre_usuario = ?1")
	Usuario find_usuario(String usuario);
	
	@Query("DELETE FROM Playlist c WHERE c.playlist_id = ?1")
	boolean Eliminar_playlist(Integer playlist_id);
	
	@Query("DELETE FROM Usuario c WHERE c.Usuario_id = ?1")
	boolean Eliminarse(Integer usuario_id);
	//void Copiar_playlist(Playlist lista);
	//void Calificar_cancion(Integer numero);
	//void Cerrar_cuenta();
	//Cancion Buscar_Cancion(String nombre);
	
	@Query("SELECT c FROM Playlist c WHERE c.Nombre_playlist = ?1 AND c.usuario_id = ?2")
	Playlist Buscar_Playlist(String nombre, Integer usuario_id);
	
	@Query("SELECT c FROM Cancion c WHERE c.Nombre_Cancion LIKE ?1"+"%")
	List<Cancion> Buscar_Cancion(String nombre);
	
	@Query("SELECT c FROM Album c WHERE c.Nombre_Album LIKE ?1"+"%")
	List<Album> Buscar_Album(String nombre);
	
	/*static final String query = "SELECT c FROM Cancion c WHERE c.Nombre_Cancion LIKE CONCAT(?1,'%')";
	@Query(query)
	List<Cancion> Buscar_Cancion(String nombre);*/

}

