package com.FoodWasteProject.WasteFoodSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "donate_food")
public class Donation {
		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long donationId;
		    private String donorName;
		    private String foodItems;
		    private String phoneNo;
		    private String description;
		    private String address;
			
		    public Donation() {
				super();
			}

			public Long getDonationId() {
				return donationId;
			}

			public void setDonationId(Long donationId) {
				this.donationId = donationId;
			}

			public String getDonorName() {
				return donorName;
			}

			public void setDonorName(String donorName) {
				this.donorName = donorName;
			}

			public String getFoodItems() {
				return foodItems;
			}

			public void setFoodItems(String foodItems) {
				this.foodItems = foodItems;
			}

			public String getPhoneNo() {
				return phoneNo;
			}

			public void setPhoneNo(String phoneNo) {
				this.phoneNo = phoneNo;
			}

			public String getDescription() {
				return description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}
		    
		    
		}




