package br.ifsp.edu.arq.dw2s6.achadosedescontos.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findById(int Id_Usuario);
	
}
