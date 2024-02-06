package com.FoodWasteProject.WasteFoodSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FoodWasteProject.WasteFoodSystem.Model.ContactForm;
import com.FoodWasteProject.WasteFoodSystem.Model.Donation;
import com.FoodWasteProject.WasteFoodSystem.Repository.DonationRepository;

import jakarta.transaction.Transactional;

@Service
public class DonationService {
	
	@Autowired
	private  DonationRepository DonateRepo;
	
    
	@Transactional
	public void save(Donation D) {
		DonateRepo.save(D);
	}
	
	 public List<Donation> getAllDonations() {
	        return DonateRepo.findAll();
	    }

	public void save(ContactForm contactForm) {
		// TODO Auto-generated method stub
		DonateRepo.save(contactForm);
		
	}

	public Donation getDonationById(Long id) {
		// TODO Auto-generated method stub
		return DonateRepo.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		DonateRepo.deleteById(id);

	}

	public List<ContactForm> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}
}
