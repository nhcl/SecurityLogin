package com.hcl.SecurityLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;



import com.hcl.SecurityLogin.model.User;
import com.hcl.SecurityLogin.repo.UserRepository;

@SpringBootApplication
public class SecurityLoginApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SecurityLoginApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("sf", bCryptPasswordEncoder.encode("123")));
		userRepository.save(new User("ng", bCryptPasswordEncoder.encode("345")));
		userRepository.save(new User("mo", bCryptPasswordEncoder.encode("mo")));
		userRepository.save(new User("hm", bCryptPasswordEncoder.encode("hm123")));
	}

}
