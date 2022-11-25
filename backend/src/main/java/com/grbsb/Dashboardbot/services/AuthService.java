package com.grbsb.Dashboardbot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grbsb.Dashboardbot.entities.User;
import com.grbsb.Dashboardbot.repositories.UserRepository;
import com.grbsb.Dashboardbot.services.exceptions.ForbiddenException;
import com.grbsb.Dashboardbot.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;

	// Buscar o usuario autenticado.
	@Transactional(readOnly = true)
	public User authenticated() {
		try {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			return userRepository.findByEmail(username);

		} catch (Exception e) {
			throw new UnauthorizedException("Invalid User");
		}
	}

	// verificar o usuario logado e ele mesmo ou admin. 
	public void validateSelfOrAdmin(Long userId) {
		User user = authenticated();
		if (!user.getId().equals(userId) && !user.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenException("Acess denied");
		}
	}

	// Validar se o usuario logado e admin.
	public void validaIfUserIsAdmin() {
		User user = authenticated();
		if (!user.hasRole("ROLE_ADMIN")) {
			throw new ForbiddenException("Acess denied");
		}

	}

}
