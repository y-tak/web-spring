package com.example.webspring.specification;

import com.example.webspring.entity.Event;
import org.springframework.data.jpa.domain.Specification;


public class EventSpecification {
    ////событие по названию

    public static Specification<Event> eventByTitle(String title)
    {
        return (Specification<Event>)(root,criteriaQuery,criteriaBu)->
                criteriaBu.equal(root.get("title"),title);
    }
}
