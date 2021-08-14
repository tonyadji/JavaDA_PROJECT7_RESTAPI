package com.nnk.springboot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nnk.springboot.domain.PoseidonUser;


public interface UserRepository extends JpaRepository<PoseidonUser, Integer>, JpaSpecificationExecutor<PoseidonUser> {

	Optional<PoseidonUser> findByUsername(String username);
}
