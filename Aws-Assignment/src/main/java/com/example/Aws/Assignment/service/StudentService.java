package com.example.Aws.Assignment.service;

import com.example.Aws.Assignment.model.Student;
import com.example.Aws.Assignment.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public  void SaveStudent(){
        Student student = new Student();
        student.setStudentId(1);
        student.setName("Reece James");
        student.setAddress("Mercy Side");

        studentRepo.save(student);
    }

}
