package com.Hertzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Artista;
import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;
import com.Hertzz.dominio.Usuario;
import com.Hertzz.repositorio.CancionRepositorio;
import com.Hertzz.repositorio.UsuarioRepositorio;

@EnableAutoConfiguration
@Controller
public class HertzzApplication {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	CancionRepositorio cancionRepositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(HertzzApplication.class, args);
	}
	
		
	@RequestMapping("/Hertzz")
	@ResponseBody
	public void login(String opcion){
		
	}
	
	@RequestMapping("/usuarios")
	@ResponseBody
	public List<Usuario> usuarios(){
		return usuarioRepositorio.findAll();
	}
	
	@RequestMapping("/usuario")
	@ResponseBody
	public Usuario usuario(String usuario){
		return usuarioRepositorio.find_usuario(usuario);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public String login(String usuario, String contrasenha){
		Usuario user = usuarioRepositorio.login_usuario(usuario, contrasenha);
		if(user != null) return "true";
		return "false";
	}
	
	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	@ResponseBody
	public String addUsuario(@RequestBody Usuario usuario){
		Usuario user = usuarioRepositorio.find_usuario(usuario.Nombre_usuario);
		if(user!=null) return "false";

		usuarioRepositorio.save(usuario);
		return "true";
	}
	
	@RequestMapping(value = "/canciones", method = RequestMethod.GET)
	@ResponseBody
	public List<Cancion> canciones(String cancion){
		return usuarioRepositorio.Buscar_Cancion(cancion);
	}
	
	@RequestMapping(value = "/albumes", method = RequestMethod.GET)
	@ResponseBody
	public List<Album> albumes(String album){
		return usuarioRepositorio.Buscar_Album(album);
	}
}
