package br.sp.gov.etec.alocacao.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.sp.gov.etec.alocacao.model.Cliente;
import br.sp.gov.etec.alocacao.model.Grupo;
import br.sp.gov.etec.alocacao.repository.ClienteRepository;
import br.sp.gov.etec.alocacao.repository.GrupoRepository;

@RestController
public class GrupoController {
	@Autowired
	GrupoRepository repository;
	
	@GetMapping("/grupo")
	public List<Grupo> grupos(){
		return repository.findAll();
	}
	
	@PostMapping("adicionar-grupo")
	public Grupo insertGrupo(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@PutMapping("/atualizar-grupo")
	public Grupo atualizarCliente(@RequestBody Grupo grupo) {
		return repository.save(grupo);
	}
	
	@DeleteMapping("/deletar-grupo/{id}")
	public ResponseEntity deletarGrupo(@PathVariable long id) {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
		
	}	
	
}