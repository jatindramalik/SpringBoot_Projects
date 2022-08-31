package com.jua.sms.repository;

import com.jua.sms.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long>{
    
}
