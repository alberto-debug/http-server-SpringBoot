package com.httpserver.server.repository;

import com.httpserver.server.model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposisory extends JpaRepository<Student, Long> {}

