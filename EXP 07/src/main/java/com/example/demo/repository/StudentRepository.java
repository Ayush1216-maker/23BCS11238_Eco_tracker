package com.example.demo.repository;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
   @Query("SELECT s FROM Student WHERE s.name=:name") // object
    List<Student>findByName(@Param("name")String name);
    @Query(value="SELECT * FROM Student WHERE email=:email",nativeQuery = true) // table
    Student findByEmail(@Param("email")String name);
//    Page<Student>findAll(Pageable pageable);
//    List<Student>

}
