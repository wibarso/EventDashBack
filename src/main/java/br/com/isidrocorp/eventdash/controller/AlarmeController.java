package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.AlarmeDAO;
import br.com.isidrocorp.eventdash.model.Alarme;

@RestController
public class AlarmeController {
	
	@Autowired
	private AlarmeDAO dao;
	
	// quero criar um metodo que me retorne TODOS os Alarmes gravados no banco
	@GetMapping("/alarmes")
	public ArrayList<Alarme> recuperaTodos(){
		
		// basicamente ele deve entrar em contato com o banco de dados e fazer um SELECT 
		ArrayList<Alarme> lista;
		lista=(ArrayList<Alarme>)dao.findAll();
		return lista;
	}
}
