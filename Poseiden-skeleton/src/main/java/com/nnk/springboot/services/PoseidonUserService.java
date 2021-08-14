/**
 * 
 */
package com.nnk.springboot.services;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nnk.springboot.domain.PoseidonUser;
import com.nnk.springboot.repositories.UserRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class PMBUserService.
 *
 * @author tonys
 */
@Service
@Transactional
public class PoseidonUserService {

	/** The user repository. */
	private final UserRepository userRepository;

	/** The password encoder. */
	private final BCryptPasswordEncoder passwordEncoder;

	/**
	 * Instantiates a new PMB user service.
	 *
	 * @param userRepository the user repository
	 * @param accountRepository the account repository
	 * @param passwordEncoder the password encoder
	 */
	public PoseidonUserService(UserRepository userRepository,
			BCryptPasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the PMB user
	 */
	public PoseidonUser findByUsername(String username) {
		final Optional<PoseidonUser> user = userRepository.findByUsername(username);
		return user.orElse(null);
	}

	
}
