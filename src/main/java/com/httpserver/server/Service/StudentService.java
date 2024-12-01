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
        student.setEmail(studentDTO.getEmail());
        student.setStudentId(studentDTO.getStudentId());
        return studentReposisory.save(student);
    }

    public List<Student> getAllStudents(){
        return studentReposisory.findAll();
    }

    public Optional<Student> getAllStudentById(Long id){
        return studentReposisory.findById(id);
    }

    public Student updateStudent(Long id, StudentDTO studentDTO){
        Optional<Student> optionalStudent = studentReposisory.findById(id);
        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
            studentDTO.setStudentId(studentDTO.getStudentId());
            return studentReposisory.save(student);
        }
        throw new RuntimeException("Student Not found");
    }

    public void deleteStudent(Long id){
        studentReposisory.deleteById(id);
    }
}
