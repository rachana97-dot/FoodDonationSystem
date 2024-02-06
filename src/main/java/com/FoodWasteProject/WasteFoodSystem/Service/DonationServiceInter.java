package com.FoodWasteProject.WasteFoodSystem.Service;

import java.util.List;

import com.FoodWasteProject.WasteFoodSystem.Model.Donation;

public interface DonationServiceInter {
	void save(Donation donation);
    List<Donation> getAllDonations();

}
