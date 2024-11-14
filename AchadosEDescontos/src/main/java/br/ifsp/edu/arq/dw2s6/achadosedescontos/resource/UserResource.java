package br.ifsp.edu.arq.dw2s6.achadosedescontos.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model.User;
import br.ifsp.edu.arq.dw2s6.achadosedescontos.repository.UserRepository;

@RestController
@RequestMapping
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping
	public List<User> list(){
		return userRepository.findAll();
	}
	
}
