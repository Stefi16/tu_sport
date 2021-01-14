package com.example.tu_sport.Entities;


import com.example.tu_sport.Entities.Sport;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "email")
    private  String email;

    @ManyToOne()
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @Column(name = "characteristic")
    private String characteristic;

    public Teachers() {
    }

    public Teachers(Long id, String firstName, String lastName, String email, String characteristic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.characteristic = characteristic;
    }

    public Teachers(Long id, String first_name, String last_name, String email, Sport sport, String characteristic) {
        this.id = id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.sport = sport;
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }


    @Override
    public String toString() {
        return "teachers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
