package com.Hertzz.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hertzz.dominio.Usuario;
import com.Hertzz.repositorio.UsuarioRepositorio;


@RestController
public class UsuarioControlador {
	@Autowired
	UsuarioRepositorio usuarioRepositorio;


	/*@RequestMapping("/usuarios")
	@ResponseBody
	public List<Usuario> usuarios() {
		return usuarioRepositorio.findAll();
	}*/
	
	/*@RequestMapping(value = "/cursos", method = RequestMethod.POST)
	@ResponseBody
	public Curso guardarCurso(@RequestBody Curso curso) {
		return cursoRepositorio.save(curso);
	}

	//@RequestMapping("/cursos")
	@RequestMapping(value = "/cursos", method = RequestMethod.GET)
	@ResponseBody
	public List<Curso> cursos() {
		return cursoRepositorio.findAll();
	}*/

}