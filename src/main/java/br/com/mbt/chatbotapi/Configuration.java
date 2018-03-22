package br.com.mbt.chatbotapi;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Configuration {
	
	public static void main(String[] args){
	    SpringApplication.run(Configuration.class, args);
	}
	
	// BD Connection
	@Bean
	public DataSource dataSource(){
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/chatbotdb");
	    dataSource.setUsername("****");
	    dataSource.setPassword("****");
	    return dataSource;
	}
}
