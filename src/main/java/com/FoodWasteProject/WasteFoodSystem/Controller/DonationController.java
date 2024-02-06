package com.FoodWasteProject.WasteFoodSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FoodWasteProject.WasteFoodSystem.Model.ContactForm;
import com.FoodWasteProject.WasteFoodSystem.Model.Donation;
import com.FoodWasteProject.WasteFoodSystem.Service.DonationService;

@Controller
//@RequestMapping("/donations")
public class DonationController {
	@Autowired
  private  DonationService DonationServ;

//    @Autowired
//    public DonationController(DonationService donationService) {
//        this.donationService = donationService;
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/donate")
	public String donate() {
		return "donate";
	}
	
//	@GetMapping("/view")
//	public String Viewfood() {
//		return "view";
//	}
	
	@GetMapping("/AboutUs")
	public String aboutus() {
		return "AboutUs";
	}
	
	@GetMapping("/Contact")
	public String contact() {
		return "Contact";
	}
	
	@GetMapping("/SignUp")
	public String signup() {
		return "SignUp";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/Organizations")
	public String organiz() {
		return "Organizations";
	}
	@GetMapping("/Event")
	public String even() {
		return "Event";
	}
	
//	@GetMapping("/edit")
//	public String edit() {
//		return "edit";
//	}
	
	@GetMapping("/thankYou")
    public String showThankYouPage() {
        return "thankYou";
	}
	
	@PostMapping("/save")
    public String saveDonation(@ModelAttribute Donation donation) {
        DonationServ.save(donation);
        return "redirect:/view"; // Redirect to a success page or any other appropriate page
    }
	
	
	 @GetMapping("/view")
	    public String viewDonations(Model model) {
	        List<Donation> donations = DonationServ.getAllDonations();
	        model.addAttribute("donations", donations);
	        return "view";
	    }
	
	 @PostMapping("/submitContactForm")
	    public String submitContactForm(@ModelAttribute ContactForm contactForm , Model model) {
	        ContactForm contactFormData = new ContactForm();
	        contactFormData.setName(contactForm.getName());
	        contactFormData.setEmail(contactForm.getEmail());
	        contactFormData.setMessage(contactForm.getMessage());

	        DonationServ.save(contactForm);

	        // You can also retrieve the saved data if needed
	        // List<ContactFormData> allContactFormData = contactFormDataRepository.findAll();
	        // model.addAttribute("contactFormDataList", allContactFormData);

	        return "redirect:/thankYou"; // Redirect to a thank you page
	    }
	 
	 
	 @GetMapping("/donation/edit/{id}")
	    public String editDonation(@PathVariable Long id, Model model) {
	        Donation donation = DonationServ.getDonationById(id);
	        model.addAttribute("donation", donation);
	        return "edit"; // Create an edit.html Thymeleaf template
	    }

	    @PostMapping("/donation/update/{id}")
	    public String updateDonation(@PathVariable Long id, @ModelAttribute Donation updatedDonation) {
	        Donation existingDonation = DonationServ.getDonationById(id);
	        existingDonation.setDonorName(updatedDonation.getDonorName());
	        existingDonation.setFoodItems(updatedDonation.getFoodItems());
	        existingDonation.setPhoneNo(updatedDonation.getPhoneNo());
	        existingDonation.setDescription(updatedDonation.getDescription());
	        existingDonation.setAddress(updatedDonation.getAddress());

	        DonationServ.save(existingDonation);

	        return "redirect:/view";
	    }

	    @GetMapping("/donation/delete/{id}")
	    public String deleteDonation(@PathVariable Long id) {
	        DonationServ.deleteById(id);
	        return "redirect:/view";
	    }
	 
	 
	    
	    

	
}
