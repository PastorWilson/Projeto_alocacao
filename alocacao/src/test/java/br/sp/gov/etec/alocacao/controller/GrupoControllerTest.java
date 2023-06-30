package br.sp.gov.etec.alocacao.controller;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import br.sp.gov.etec.alocacao.model.Grupo;

public class GrupoControllerTest {
	
	@InjectMocks
	GrupoControllerTest controller;
	
	@Test
	public List<Grupo> listarGrupoTest() {
		List<Grupo> grupo = controller.listarGrupoTest();
		return grupo;
	}
}