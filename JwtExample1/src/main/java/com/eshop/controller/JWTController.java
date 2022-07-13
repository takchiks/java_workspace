package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.entity.JWTRequest;
import com.eshop.entity.JWTResponse;
import com.eshop.helper.JwtUtil;
import com.eshop.service.CustomUserDetailsService;

@RestController
@CrossOrigin
public class JWTController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	JwtUtil jwtUtil;
	
	@PostMapping("/token")
	public ResponseEntity<JWTResponse> generateToken(@RequestBody JWTRequest jwtRequest) {
		System.out.println("we are here");
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		
		UserDetails userDetails = customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		
		String token = jwtUtil.generateToken(userDetails);
		
		System.out.println("Token is "+token);
		
		return ResponseEntity.ok(new JWTResponse(token));
		
	}

//	@PostMapping("/token")
//	public String getToken(@RequestBody JWTRequest jwtRequest ) {
//		System.out.println(jwtRequest);
//		return "logein";
//	}
	

}
