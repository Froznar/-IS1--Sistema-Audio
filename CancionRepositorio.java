package com.Hertzz.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Usuario;


public interface CancionRepositorio extends CrudRepository<Cancion, Integer> {
	List<Cancion>findAll();
	@Query("SELECT c FROM Cancion c ORDER BY c.Anteriror_Ranking_popular DESC")
	List<Cancion> Top100();
	
	
}
