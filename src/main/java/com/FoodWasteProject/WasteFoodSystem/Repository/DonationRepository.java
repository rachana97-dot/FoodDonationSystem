 package com.FoodWasteProject.WasteFoodSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FoodWasteProject.WasteFoodSystem.Model.ContactForm;
import com.FoodWasteProject.WasteFoodSystem.Model.Donation;
@Repository
public interface DonationRepository extends JpaRepository<Donation, Long>{

void save(ContactForm contactForm);

}
