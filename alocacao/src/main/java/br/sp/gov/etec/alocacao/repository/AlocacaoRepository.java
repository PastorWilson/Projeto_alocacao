package br.sp.gov.etec.alocacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.sp.gov.etec.alocacao.model.Alocacao;

@Repository
public interface AlocacaoRepository extends JpaRepository<Alocacao, Long> {

}
