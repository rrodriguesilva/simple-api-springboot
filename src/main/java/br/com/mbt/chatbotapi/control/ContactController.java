package br.com.mbt.chatbotapi.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.mbt.chatbotapi.model.Contact;
import br.com.mbt.chatbotapi.repository.ContactRepository;

@Controller
@RequestMapping(path="/contact")
public class ContactController {
	
	@Autowired
	private ContactRepository repository;
	
	@RequestMapping(value= "/saveContact", method = RequestMethod.POST)
	public @ResponseBody String saveContact(@RequestParam("name") String name, @RequestParam("email") String email, 
	                   @RequestParam("phone") String phone){

	    Contact c= new Contact();
	    c.setName(name);
	    c.setEmail(email);
	    c.setPhone(phone);
	    repository.save(c);
		return "Saved";

	}
}
