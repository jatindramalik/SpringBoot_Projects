package com.jua.sms.service.impl;

import java.util.List;

import com.jua.sms.entity.Student;
import com.jua.sms.repository.StudentRepository;
import com.jua.sms.service.StudentService;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);;
        
    }
    
}
