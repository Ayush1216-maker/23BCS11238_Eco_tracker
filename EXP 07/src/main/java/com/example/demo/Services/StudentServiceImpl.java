package com.example.demo.Services;

import com.example.demo.Services.StudentService;
import com.example.demo.dto.StudentDTO;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository){
        this.repository=repository;
    }

    @Override
    public Student createStudent(StudentDTO dto){
        Student student=new Student();
        student.setName(dto.getName());
        student.setCourse(dto.getCourse());
        student.setEmail(dto.getEmail());

        return repository.save(student);
    }
    public List<Student>getAllStudents(){
        return repository.findAll();
    }
    @Override
    public List<Student> deleteById(int id) {
        repository.deleteById(id);
        return repository.findAll();
    }

}
