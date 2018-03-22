package br.com.mbt.chatbotapi.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.mbt.chatbotapi.model.QuestionsChat;
import br.com.mbt.chatbotapi.repository.QuestionsChatRepository;

@Controller
@RequestMapping(path="/questionsChat")
public class QuestionsChatController {
	
	@Autowired
	private QuestionsChatRepository questionsChatRepository;
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<QuestionsChat> getAllUsers() {
		// This returns a JSON or XML with the users
		return questionsChatRepository.findAll();
	}
}
