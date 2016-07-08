package com.Hertzz.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Artista;

public interface ArtistaRepositorio extends CrudRepository<Artista, Integer> {
	List<Artista> findAll();
	
	
	
}