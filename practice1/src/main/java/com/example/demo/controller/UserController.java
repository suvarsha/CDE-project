package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.pojos.User;
import com.example.demo.repo.UserRepo;
@RestController
public class UserController {
@Autowired
UserRepo userRepo;
@GetMapping("/user")
public String exmp(){
	return "hello";
}
@GetMapping("/users")
public List<User> getAll(){
	return userRepo.findAll();
}
@GetMapping("/find/{id}")
public User findAllinOne(@PathVariable("id") String id)
{

Optional<User> user=userRepo.findById(id);
	return user.get();
}

@PostMapping("/users")
public  User save(@RequestBody User usr) {
	User b = userRepo.save(usr);
	return b;
}

@DeleteMapping("/deleteUser/{id}")
public boolean deleteUser(@PathVariable("id") String id)
{
	

	System.out.println(id);
	
	userRepo.deleteById(id);
	return true;
}

@PutMapping("/users")
public User update(@RequestBody User usr) {
	User b = userRepo.save(usr);
	return b;
}

}
