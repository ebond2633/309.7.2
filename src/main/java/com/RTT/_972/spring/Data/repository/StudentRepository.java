package com.RTT._972.spring.Data.repository;


import com.RTT._972.spring.Data.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface  StudentRepository extends CrudRepository<Student, Long> {
    // following are custom methods
    Student findByAccountNo (Long accountNo) ;
    List<Student> findByNameContaining(String name);
}



