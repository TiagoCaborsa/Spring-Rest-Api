package br.com.starstore.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starstore.dao.AgendaDao;
import br.com.starstore.model.AgendaModel;

@RestController
@RequestMapping("/aluno")
public class AgendaController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AgendaModel> buscarProduto() throws Exception {
		return new AgendaDao().buscar();
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AgendaModel> adicionarProduto(@RequestBody AgendaModel agenda) throws Exception {
		new AgendaDao().adicionar(agenda);
		return ResponseEntity.created(URI.create("/aluno")).build();
	}

}
