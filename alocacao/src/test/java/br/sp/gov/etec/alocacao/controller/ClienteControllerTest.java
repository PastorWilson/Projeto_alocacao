package br.sp.gov.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.GetMapping;

import br.sp.gov.etec.alocacao.Controller.ClienteController;
import br.sp.gov.etec.alocacao.model.Cliente;
import br.sp.gov.etec.alocacao.repository.ClienteRepository;

@ExtendWith(SpringExtension.class)
public class ClienteControllerTest {
	
	@Mock
	ClienteRepository repository;
	
	@InjectMocks
	ClienteController controller;
	
	private	Cliente cliente;
	private	List<Cliente> listaClientes;
	
	@BeforeEach
	public void setup(){
		cliente = new Cliente();
		cliente.setNome("Teste");
		cliente.setCpf("123");
		cliente.setEmail("teste@teste");
		cliente.setId(1L);
		cliente.setTelefone("000");
		
		listaClientes = List.of(cliente);
	}
	@Test
	public void testeClientes() {
		Mockito.when(repository.findAll()).thenReturn(listaClientes);
		List<Cliente> clientes = controller.clientes();
		assertEquals("123", clientes.get(0).getCpf());
		
	}
	
	@Test
	public void testeAdicionarCliente() {
		Mockito.when(repository.save(any(Cliente.class))).thenReturn(cliente);
		Cliente c = controller.insertCliente(new Cliente());
		assertEquals("teste@teste", c.getEmail());
		
	}
	

	@Test
	public void testeAtualizarCliente() {
		Mockito.when(repository.save(any(Cliente.class))).thenReturn(cliente);
		Cliente c = controller.atualizarCliente(new Cliente());
		assertEquals(1L, c.getId());
		
	}
	
	@Test
	public void testeDeletarCliente() {
		//Mockito.when(repository.delete(any(Cliente.class))).thenReturn(cliente);
		ResponseEntity response  = controller.deletarCliente(1L);
		assertEquals(200, response.getStatusCode().value());
		
	}
}
