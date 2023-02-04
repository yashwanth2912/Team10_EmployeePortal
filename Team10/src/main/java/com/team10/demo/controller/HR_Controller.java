package com.team10.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.team10.demo.model.User;

import com.team10.demo.repository.UserRepository;
import com.team10.demo.service.UserService;

@Controller

public class HR_Controller {
 
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private UserService userService;
    @Autowired

    
    @GetMapping("/")
   public String viewHomePage() {
       return "Home";
   }
  @GetMapping("/hr/login")
  public String HRLogin() {
	   return "hr/hr_login";
  }
  
  @GetMapping("hr/home")
  public String HRhome()
  {
	   return "hr/hr_home";
  }

  

  @GetMapping("/hr/addEmployee")
  public String addEmployee(Model model) {
      User user=new User();
      model.addAttribute("user",user);
      return "hr/addemployee";
  }
  
 
  @PostMapping("/hr/saveEmployee")
  public String saveEmployee(@ModelAttribute("user") User user){
	  userRepo.save(user);
      return "redirect:/hr/listofusers";
  }
		 
  
  @GetMapping("/hr/listofusers")
	public String emplist(Model model) {
		List<User> emplist = userRepo.findAll();
		model.addAttribute("emplist", emplist);
		return "hr/viewemployeelist";
	}

  
  @GetMapping("/hr/MyProfile")
  public String viewProfile()
  {
  	return "hr/HRProfile";
  }
  
  @GetMapping("/hr/deleteEmployee")
  public String deleteEmployee(@RequestParam Integer id){
	  
      userService.deleteEmployeeById(id);
      return "redirect:/hr/listofusers";
  }

}
