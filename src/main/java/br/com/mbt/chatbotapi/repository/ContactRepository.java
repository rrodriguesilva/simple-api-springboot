package br.com.mbt.chatbotapi.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.mbt.chatbotapi.model.Contact;

//Interface to access database
public interface ContactRepository extends CrudRepository<Contact, Long>{

}
