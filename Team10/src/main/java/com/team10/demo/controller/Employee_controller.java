package com.team10.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




import com.team10.demo.repository.UserRepository;

import com.team10.demo.service.UserService;

@Controller
public class Employee_controller {
@Autowired
UserRepository userRepo;
@Autowired
UserService userService;
@Autowired


@GetMapping("/employee/login")
public String EmployeeLogin() {
	   return "employee/employee_login";
}

@GetMapping("/employee/home")
public String EmployeeHome() {
	   return "employee/employee_home";
}


@GetMapping("/employee/viewProfile")
public String viewProfile()
{
	return "employee/employeeProfile";
}



 


}
