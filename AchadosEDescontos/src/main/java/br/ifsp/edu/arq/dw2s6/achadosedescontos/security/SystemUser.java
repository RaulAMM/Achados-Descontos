package br.ifsp.edu.arq.dw2s6.achadosedescontos.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import br.ifsp.edu.arq.dw2s6.achadosedescontos.domain.model.User;


public class SystemUser extends org.springframework.security.core.userdetails.User{

	private static final long serialVersionUID = 1L;

	private User user;

	public SystemUser(User user, Collection<? extends GrantedAuthority> authorities) {
		super(user.getEmail(), user.getSenha(), authorities);
		this.user = user;
	}

	public User getUser() {
		return user;
	}
	
}
