package com.nit;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nit.entity.Address;
import com.nit.entity.Book;
import com.nit.entity.Student;
import com.nit.repository.StudentRepository;

@SpringBootApplication
public class SpringbootRelationsSep26Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRelationsSep26Application.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student st = new Student("Rama", "9988777765");
		Address add = new Address("ammerpeta", "Hyderabad");
		Book book1 = new Book("Microservices");
		Book book2 = new Book("SpringBoot");
		Book book3 = new Book("SpringFramework");
		st.setAddress(add);
	    st.getBooks().add(book1);
		st.getBooks().add(book2);
		st.getBooks().add(book3);
		st = studentRepository.save(st);
		System.out.println(st);
	}

}