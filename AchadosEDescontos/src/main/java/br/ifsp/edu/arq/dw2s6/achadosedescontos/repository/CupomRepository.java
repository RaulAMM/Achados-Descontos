package br.ifsp.edu.arq.dw2s6.achadosedescontos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model.Cupom;

public interface CupomRepository extends JpaRepository<Cupom, Integer>{
	Optional<Cupom> findviewby(int Id_Cupom);

}
