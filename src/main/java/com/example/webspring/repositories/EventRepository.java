package com.example.webspring.repositories;

import com.example.webspring.entity.Event;
import org.springframework.data.repository.CrudRepository;
                                                      //сущность, тип ключа
public interface EventRepository extends CrudRepository<Event,Integer> {



}
