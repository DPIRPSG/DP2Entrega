/* CertificationCustomerController.java
 *
 * Copyright (C) 2014 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 * 
 */

package controllers.customer;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import services.CertificationService;
import controllers.AbstractController;
import domain.Certification;

@Controller
@RequestMapping("/certification/customer")
public class CertificationCustomerController extends AbstractController {
	
	// Services ---------------------------------------------------------------

	@Autowired
	private CertificationService certificationService;
	
	// Constructors -----------------------------------------------------------
	
	public CertificationCustomerController() {
		super();
	}

	// Listing ----------------------------------------------------------------
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView result;
		Collection<Certification> certifications;
		
		certifications = certificationService.findAllActive();
		
		result = new ModelAndView("certification/list");
		result.addObject("certifications", certifications);
		result.addObject("requestURI", "certification/customer/list.do");
		
		return result;
	}

	// Creation ---------------------------------------------------------------

	// Edition ----------------------------------------------------------------
	
	// Ancillary methods ------------------------------------------------------

}