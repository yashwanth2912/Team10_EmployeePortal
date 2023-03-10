package com.team10.demo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.team10.demo.model.User;

public class MyUserDetails implements UserDetails{
	private User user;



	public MyUserDetails(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		  List<SimpleGrantedAuthority> authorities = new ArrayList<>();
	         
	        authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
	         
	        return authorities;

	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getUsername();
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

	    public String getFirstName() {
	    	return user.getFirstName();    }
	    public String getLastName() {
	    	return user.getLastName();    }
	    public int getId() {
	    	return user.getId();    }
	    public String getAddress() {
	    	return user.getAddress();    }
	    public String getContact() {
	    	return user.getContact();    }
	    public Date getDob() {
			return user.getDob();
		}
	    public String getEmail() {
	    	return user.getEmail();    }
}
