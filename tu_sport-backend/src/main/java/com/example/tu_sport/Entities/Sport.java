package com.example.tu_sport.Entities;

import javax.persistence.*;

@Entity
@Table(name = "sports")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "day")
    private String day;

    @Column(name = "time")
    private String time;

    public Sport() {

    }

    public Sport(Long id, String name, String day, String time) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.time = time;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", day=" + day +
                ", time=" + time +
                '}';
    }
}
