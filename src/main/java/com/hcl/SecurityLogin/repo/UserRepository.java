package com.hcl.SecurityLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hcl.SecurityLogin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
