package br.ifsp.edu.arq.dw2s6.achadosedescontos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model.Instituicao;

public interface InstituicaoRepository extends JpaRepository<Instituicao, String>{
	
	Optional<Instituicao> findByCnpj(String cnpj);
}
