package net.mofed.reportracking.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import net.mofed.reportracking.app.model.User;
import net.mofed.reportracking.app.repository.MyUserRepository;

@Service

public class MyUserService {
	
	  @Autowired
	   private MyUserRepository myuserrepository;
	  
	  
	  @Autowired private BCryptPasswordEncoder encoder;
	  
	   	    public List<User> ListUser(){
	    
	    	return myuserrepository.findAll();
	    }
	    
	    public void save(User user) {
	    	user.setPassword(encoder.encode(user.getPassword()));
	    	myuserrepository.save(user);
	    }
	    
	    public Optional findById(Long id) {
	    	
	    	return myuserrepository.findById(id);
	    }
	     
	    public void delete(Long id) {
	    	myuserrepository.deleteById(id);
	    }

		public User findByUsername(String un) {
			// TODO Auto-generated method stub
			return myuserrepository.findByUsername(un);
			
		}

	    
		}
