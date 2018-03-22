package br.com.mbt.chatbotapi.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.JsonObject;

@Controller
@RequestMapping(path="/home")
public class HomeController {
	
	@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:8080" }, maxAge = 6000)
	@GetMapping(path="/alert")
	public @ResponseBody String alert() {
		JsonObject j = new JsonObject();
        j.addProperty("apimsg", "<div _ngcontent-c1=\"\" class=\"alert alert-success alert-dismissible col-lg-5\" role=\"alert\">\n" + 
        		"        <button _ngcontent-c1=\"\" aria-label=\"Close\" class=\"close ng-star-inserted\" type=\"button\">\n" + 
        		"              <span _ngcontent-c1=\"\" aria-hidden=\"true\">×</span>\n" + 
        		"        </button>\n" + 
        		"       Diretamente da API: Lorem ipsum dolor sit amet, consectetur adipisicing elit.\n" + 
        		"                  Voluptates est animi quibusdam praesentium quam, et perspiciatis,\n" + 
        		"                  consectetur velit culpa molestias dignissimos\n" + 
        		"                  voluptatum veritatis quod aliquam! Rerum placeat necessitatibus, vitae dolorum\n" + 
        		"      </div>");
        
        String stringJson = j.toString();
        
        return stringJson;

	}


}
