package com.kaligent.springboot.learnjpaandhibernate.course.jdbc;

import com.kaligent.springboot.learnjpaandhibernate.course.Course;
import com.kaligent.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // private CourseJdbcRepository repository;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.insert(new Course(1, "Learn AWS JPA", "in28minutes"));
        repository.insert(new Course(2, "Learn Azure JPA", "in28minutes"));
        repository.insert(new Course(3, "Learn GCP JPA", "in28minutes"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
    
}
