package com.eshop.entity;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetails implements UserDetails {
	
	User user;
	
	public CustomUserDetails(User user) {
		System.out.println("inside constr of CustomUserDetails");
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		HashSet<SimpleGrantedAuthority> set = new HashSet<>();
		set.add(new SimpleGrantedAuthority(user.getRole()));
		
		System.out.println("The role is "+user.getRole());
		return set;
	}

	@Override
	public String getPassword() {
		
		System.out.println("inside getPass()");
		
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		
		System.out.println("inside getUsername()");
		
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		
		System.out.println("inside isAccountNonExpired");
		
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}

	@Override
	public boolean isEnabled() {
		
		return user.isActive();
	}

}
