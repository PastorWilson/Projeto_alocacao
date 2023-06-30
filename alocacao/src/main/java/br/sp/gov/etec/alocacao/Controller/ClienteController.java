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

import br.sp.gov.etec.alocacao.model.Carro;
import br.sp.gov.etec.alocacao.model.Cliente;
import br.sp.gov.etec.alocacao.repository.ClienteRepository;

@RestController
public class ClienteController {
	@Autowired
	ClienteRepository repository;
	
	@GetMapping("/cliente")
	public List<Cliente> clientes(){
		return repository.findAll();
	}
	
	@PostMapping("adicionar-cliente")
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@PutMapping("/atualizar-cliente")
	public Cliente atualizarCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@DeleteMapping("/deletar-cliente/{id}")
	public ResponseEntity deletarCliente(@PathVariable long id) {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
		
	}	
	
}
