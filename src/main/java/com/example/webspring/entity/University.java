package com.example.webspring.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class University {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    private int id;


    private String uneversityName;

    @OneToMany(mappedBy = "university",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
    orphanRemoval = true)
    private List<Student> students=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUneversityName() {
        return uneversityName;
    }

    public void setUneversityName(String uneversityName) {
        this.uneversityName = uneversityName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
