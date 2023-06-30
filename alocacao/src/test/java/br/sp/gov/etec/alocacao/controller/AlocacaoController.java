package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import br.sp.gov.etec.alocacao.model.Alocacao;

public class AlocacaoController {

	@InjectMocks
	AlocacaoController controller;
	
	@Test
	public List<Alocacao> listarAlocacaoTest() {
		List<Alocacao> alocacao = controller.listarAlocacaoTest();
		return alocacao;
		
	}
	
}
