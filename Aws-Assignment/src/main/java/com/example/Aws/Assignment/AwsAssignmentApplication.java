package com.example.Aws.Assignment;

import com.example.Aws.Assignment.model.Student;
import com.example.Aws.Assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AwsAssignmentApplication {

	@Autowired
	private final StudentService studentService;

	public AwsAssignmentApplication(StudentService studentService) {
		this.studentService = studentService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsAssignmentApplication.class, args);
		System.out.println("Hello, am in prod env");
	}

	@PostConstruct
	public void saveStudentOnStartup() {
		studentService.SaveStudent();
	}

}
