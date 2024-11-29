package com.httpserver.server.Service;

import com.httpserver.server.dto.StudentDTO;
import com.httpserver.server.model.Student;
import com.httpserver.server.repository.StudentReposisory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentReposisory studentReposisory;

    public Student CreateStudent(StudentDTO studentDTO) {

        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(student.getEmail());
        student.setStudentId(student.getStudentId());
        return studentReposisory.save(student);
    }

    public List<Student> getAllStudents(){
        return studentReposisory.findAll();
    }

    public Optional<Student> getAllStudentById(Long id){
        return studentReposisory.findById(id);
    }




}
