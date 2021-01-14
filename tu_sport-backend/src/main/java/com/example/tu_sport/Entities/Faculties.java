package com.example.tu_sport.Entities;


import javax.persistence.*;

@Entity
@Table(name = "faculties")
public class Faculties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Faculties() {
    }

    public Faculties(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Faculties{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}