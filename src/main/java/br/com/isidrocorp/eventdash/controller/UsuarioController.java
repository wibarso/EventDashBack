package br.com.isidrocorp.eventdash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.UsuarioDAO;
import br.com.isidrocorp.eventdash.model.Usuario;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDAO dao;
	
	//quero fazer um metodo de login 
	
	@PostMapping("/login")
	public Usuario fazerLogin(@RequestBody Usuario dadosLogin) {
		
		
		Usuario res = dao.findByEmailOrRacf(dadosLogin.getEmail(), dadosLogin.getRacf());
		return res;
	}
}
