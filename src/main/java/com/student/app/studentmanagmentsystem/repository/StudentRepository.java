package com.student.app.studentmanagmentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.app.studentmanagmentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
