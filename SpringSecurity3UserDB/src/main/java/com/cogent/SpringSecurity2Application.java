package com.cogent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.cogent.model.User;
import com.cogent.repo.UserRepo;

@SpringBootApplication
public class SpringSecurity2Application implements CommandLineRunner {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurity2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User("taku", bCryptPasswordEncoder.encode("taku"), "taku@gmail.com");
		User user2 = new User("taku2", bCryptPasswordEncoder.encode("taku"), "taku2@gmail.com");
		User user3 = new User("taku3", bCryptPasswordEncoder.encode("taku"), "taku3@gmail.com");
		userRepo.save(user1);
		userRepo.save(user2);
		userRepo.save(user3);

	}
}
