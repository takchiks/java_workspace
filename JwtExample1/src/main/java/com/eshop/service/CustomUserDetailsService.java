package com.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eshop.entity.CustomUserDetails;
import com.eshop.entity.User;
import com.eshop.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findById(username).get();

		return new CustomUserDetails(user);

//		switch(username) {
//
//		case "phil":
//
//			User user1 = new User("phil", "Phil", "Belinksy", "12345", "342423", "NORMAL", false);
//
//			return new CustomUserDetails(user1);
//
//		case "pranav":
//
//			User user2 = new User("pranav", "Pranav", "Dadu", "1234", "111111", "ADMIN", true);
//
//			return new CustomUserDetails(user2);
//
//		case "kisa":
//
//			User user3 = new User("kisa", "Kisa", "Ali", "123", "222222", "STUDENT", true);
//			
//			return new CustomUserDetails(user3);
//
//		default:
//			
//			User user4 = new User("jamie", "Jamie", "Nguyen", "12", "333333", "ADMIN", false);
//			
//			return new CustomUserDetails(user4);
//			
//		}

	}

}
