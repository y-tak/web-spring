package com.example.webspring.repositories;

import com.example.webspring.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,Integer> {


    ///добавление записи
    //удаление запиаи
    //обновление записи
    //получение по первичному ключу
    //получение всех записей

    @Query("Select c FROM Student c WHERE c.studentCode=:studentCode")
    Optional<Student>findByCode(@Param("studentCode") String studentCode);

}
