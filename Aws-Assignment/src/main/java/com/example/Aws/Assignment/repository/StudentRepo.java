package com.example.Aws.Assignment.repository;

import com.example.Aws.Assignment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student , Integer> {
}
