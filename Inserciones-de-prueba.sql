insert into album(album_id,fecha_album,nombre_album) VALUEs(1,'2012','The Rasmus');
insert into album(album_id,fecha_album,nombre_album) VALUEs(2,'2014','Transmissions');

Insert into artista(id_artista,nombre_artista) values(1,'The rasmus');
Insert into artista(id_artista,nombre_artista) values(2,'Starset');

insert into artista_album(album_id,artista_id) values(1,1);
insert into artista_album(album_id,artista_id) values(2,2);




Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(1,0,0,1,5,'1012',1,'xxxxxxxxxx','The Rasmus','Stranger',29)

Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(1,0,0,1,5,'1012',2,'xxxxxxxxxx','The Rasmus','Im a mess',29);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(1,0,0,1,5,'1012',3,'xxxxxxxxxx','The Rasmus','End of a story',29);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(1,0,0,1,5,'1012',4,'xxxxxxxxxx','The Rasmus','Sky',29);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(1,0,0,1,5,'1012',5,'xxxxxxxxxx','The Rasmus','Somewhere',29);

Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(2,0,0,2,5,'1014',6,'xxxxxxxxxx','Starset','Halo',23);

Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(2,0,0,2,5,'1014',7,'xxxxxxxxxx','Starset','Let id D  ie',23);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(2,0,0,2,5,'1014',8,'xxxxxxxxxx','Starset','Carnivore',23);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(2,0,0,2,5,'1014',9,'xxxxxxxxxx','Starset','Telescope',23);
Insert into cancion(album_id,anteriror_ranking_nota,anteriror_ranking_popular,artista_id,calificacion_cancion,fecha_publicacion,id,letra_cancion,nombre_autor,nombre_cancion,reproducciones)
Values(2,0,0,2,5,'1014',10,'xxxxxxxxxx','Starset','My Demons',23);

insert into artista_cancion(artista_id,cancion_id) values(1,1);
insert into artista_cancion(artista_id,cancion_id) values(1,2);
insert into artista_cancion(artista_id,cancion_id) values(1,3);
insert into artista_cancion(artista_id,cancion_id) values(1,4);
insert into artista_cancion(artista_id,cancion_id) values(1,5);

insert into artista_cancion(artista_id,cancion_id) values(2,6);
insert into artista_cancion(artista_id,cancion_id) values(2,7);
insert into artista_cancion(artista_id,cancion_id) values(2,8);
insert into artista_cancion(artista_id,cancion_id) values(2,9);
insert into artista_cancion(artista_id,cancion_id) values(2,10);