package com.team10.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.team10.demo.model.User;
import com.team10.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepo;


public void deleteEmployeeById(int id) {
	userRepo.deleteById(id);
	
}


}
