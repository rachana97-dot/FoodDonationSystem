package com.FoodWasteProject.WasteFoodSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactForm {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	    private String name;
	    private String email;
	    private String message;

	    public ContactForm() {
	        // Default constructor
	    }

	    // Getters and Setters

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    
	}


