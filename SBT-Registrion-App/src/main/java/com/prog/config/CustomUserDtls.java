package com.prog.config;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.prog.entity.UserDtls;

public class CustomUserDtls implements UserDetails {

	private UserDtls u;

	public CustomUserDtls(UserDtls u) {
		super();
		this.u = u;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		HashSet<SimpleGrantedAuthority> set = new HashSet<SimpleGrantedAuthority>();
		set.add(new SimpleGrantedAuthority(u.getRole()));
		return set;
	}

	@Override
	public String getPassword() {

		return u.getPassword();
	}

	@Override
	public String getUsername() {

		return u.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
