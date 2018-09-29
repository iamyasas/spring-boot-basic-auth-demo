package com.iamyasas.springbootbasicauthdemo.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("user".equals(username)) {
			return User.withUsername("user").password("{noop}pass").roles("USER").build();
		}
		else if ("admin".equals(username)) {
			return User.withUsername("admin").password("{noop}pass").roles("ADMIN").build();
		}
		else if ("editor".equals(username)) {
			return User.withUsername("editor").password("{noop}pass").roles("EDITOR").build();
		}
		else if ("1".equals(username)) {
			return User.withUsername("1").password("{noop}pass").roles("USER").build();
		}
		else {
			throw new UsernameNotFoundException("User name does not exist");
		}
	}
}
