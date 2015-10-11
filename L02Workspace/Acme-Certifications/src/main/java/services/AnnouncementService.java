/* AnnouncementService.java
 *
 * Copyright (C) 2014 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package services;

import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import repositories.AnnouncementRepository;
import domain.Announcement;
import domain.Customer;

@Service
@Transactional
public class AnnouncementService {

	// Managed repository -----------------------------------------------------

	@Autowired
	private AnnouncementRepository announcementRepository;	
	
	// Supporting services ----------------------------------------------------
	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private RegistrationService registrationService;
	
	// Constructors -----------------------------------------------------------

	public AnnouncementService() {
		super();
	}
	
	// Simple CRUD methods ----------------------------------------------------
	
	public Announcement create() {
		Announcement result;

		result = new Announcement();		

		return result;
	}
	
	public Collection<Announcement> findAll() {
		Collection<Announcement> result;

		Assert.notNull(announcementRepository);
		result = announcementRepository.findAll();		
		Assert.notNull(result);
		
		return result;
	}

	public Announcement findOne(int announcementId) {
		Announcement result;
		
		result = announcementRepository.findOne(announcementId);		

		return result;
	}
	
	public void save(Announcement announcement) {
		assert announcement != null;
		
		Date currentMoment;
		
		currentMoment = new Date();
		Assert.isTrue(announcement.getCertification().getExtinctionDate().after(currentMoment));
		Assert.isTrue(announcement.getCertification().getExams().contains(announcement.getExam()));
		
		announcementRepository.save(announcement);
	}	
	
	public void delete(Announcement announcement) {
		assert announcement != null;
		assert announcement.getId() != 0;
		
		Assert.isTrue(announcementRepository.exists(announcement.getId()));
		Assert.isTrue(!registrationService.existsRegistrationForAnnouncement(announcement));
		
		announcementRepository.delete(announcement);
	}

	// Other business methods -------------------------------------------------
	
	public Collection<Announcement> findRegistered() {
		Collection<Announcement> result;
		Customer customer;
		
		customer = customerService.findByPrincipal();
		Assert.notNull(customer);
		result = announcementRepository.findByCustomerId(customer.getId());
		
		return result;
	}

	public Collection<Announcement> findAllActive() {
		Collection<Announcement> result;
		Date currentMoment;

		currentMoment = new Date();
		result = announcementRepository.findAllActive(currentMoment);		
		Assert.notNull(result);
		
		return result;
	}
	
}