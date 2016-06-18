package com.Hertzz.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Administrador;

public interface AdministradorRepositorio extends CrudRepository<Administrador, Integer> {
	List<Administrador> findAll();
	
	//bool Agregar_Artista(Artista artita);
	//bool Agregar_Album(Album Album);
	//bool Eliminar_Artista(Artista artista);
	//bool Eliminar_Album(Album Album);
}