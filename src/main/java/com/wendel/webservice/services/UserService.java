package com.wendel.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wendel.webservice.entities.User;
import com.wendel.webservice.repositories.UserRepository;
import com.wendel.webservice.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User updatedUser) {
		User user = userRepository.getOne(id);
		updateData(user, updatedUser);
		return userRepository.save(user);
	}

	private void updateData(User user, User updatedUser) {
		user.setName(updatedUser.getName());
		user.setEmail(updatedUser.getEmail());
		user.setPhone(updatedUser.getPhone());
		
	}
}