package com.kaligent.springboot.learnjpaandhibernate.course.jdbc;

import com.kaligent.springboot.learnjpaandhibernate.course.Course;
import com.kaligent.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;




@Component
public class CourseCommandLineRunner implements CommandLineRunner{

    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.save(new Course(1, "Learn AWS JPA", "in28minutes"));
        repository.save(new Course(2, "Learn Azure JPA", "in28minutes"));
        repository.save(new Course(3, "Learn GCP JPA", "in28minutes"));

        repository.deleteById(1l);
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.findByAuthor("in28minutes"));

        System.out.println(repository.findByName("Learn AWS JPA"));
    }
    
}
