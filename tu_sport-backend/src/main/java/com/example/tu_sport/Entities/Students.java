package com.example.tu_sport.Entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name = "course_id")
    private Courses course;

    @Column(name = "fac_number")
    private Long facultyNumber;

    @ManyToOne()
    @JoinColumn(name = "sport_1_id")
    private Sport firstSport;

    @ManyToOne()
    @JoinColumn(name = "sport_2_id")
    private Sport secondSport;

    @Column(name = "email")
    private String email;

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

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public Long getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(Long facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public Sport getFirstSport() {
        return firstSport;
    }

    public void setFirstSport(Sport firstSport) {
        this.firstSport = firstSport;
    }

    public Sport getSecondSport() {
        return secondSport;
    }

    public void setSecondSport(Sport secondSport) {
        this.secondSport = secondSport;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", facultyNumber=" + facultyNumber +
                ", firstSport=" + firstSport +
                ", secondSport=" + secondSport +
                ", email='" + email + '\'' +
                '}';
    }
}
