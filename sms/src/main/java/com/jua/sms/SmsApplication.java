package com.jua.sms;

import com.jua.sms.entity.Student;
import com.jua.sms.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("Ramesh","malik","rameshmalik@gmail.xom");
		// studentRepository.save(student1);

		// Student student2 = new Student("Tingu","malik","tingumalik@gmail.xom");
		// studentRepository.save(student2);

		// Student student3 = new Student("Rania","malik","raniamalik@gmail.xom");
		// studentRepository.save(student3);
		
	}

}
