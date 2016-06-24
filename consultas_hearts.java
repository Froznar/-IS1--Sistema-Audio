// Query for a List of objects.
Query query = em.createQuery("Select e FROM Employee e WHERE e.salary > 100000");
List<Employee> result = query.getResultList();
/*Usuario */
	/*Lista de Playlists*/
	Query query = em.createQuery("Select p.nombrePlaylist FROM Playlist ");
	List<Playlist> result = query.getResultList();
	/*Lista de Usuarios(u) a los que u sigue--->Falta agregar Campo seguidos en Usuario*/
	Query query = em.createQuery("Select u.seguidos FROM Usuario ");
	List<Usuario> result = query.getResultList();
	/*Lista de Usuarios(u) que siguen a u--->Falta agregar Campo seguidores en Usuario*/
	Query query = em.createQuery("Select u.seguidores FROM Usuario ");
	List<Usuario> result = query.getResultList();
	/*Lista de Historial de Canciones */


/*Artista*/
	/*Lista de Canciones de un Artista*/
	Query query = em.createQuery("Select c.cancionNombre FROM Cancion WHERE c.nombreAutor='The Beatles' ");
	List<Cancion> result = query.getResultList();
	/*Lista de Albums de un Artista*/
	Query query = em.createQuery("Select a.nombreAlbum FROM Album WHERE a.nombreAlbum='Revolver' ");
	List<Album> result = query.getResultList();

/*Playlist*/
	/*Lista de Canciones de un Playlist--->Falta agrefar el Campo plalistId*/
	Query query = em.createQuery("Select c.cancionNombre FROM Cancion WHERE c.playlistId='1' ");
	List<Cancion> result = query.getResultList();

/*Album*/
	/*Lista de Canciones de un Album*/
	Query query = em.createQuery("Select c.cancionNombre FROM Cancion WHERE c.albumId='1' ");
	List<Cancion> result = query.getResultList();

//SELECT e FROM Employee e JOIN e.projects p JOIN e.projects p2 WHERE p.name = :p1 and p2.name = :p2
