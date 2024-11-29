package com.httpserver.server.repository;

import com.httpserver.server.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposisory extends JpaRepository<Student, Long> {}
