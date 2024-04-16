package com.auth.springauth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.auth.springauth.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  UserDetails findByLogin(String login);
}
