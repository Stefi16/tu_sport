package com.example.tu_sport.Repositories;

import com.example.tu_sport.Entities.Students;
import com.example.tu_sport.Entities.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentsRepo extends JpaRepository<Students, Long> {

    @Query("SELECT s FROM Students s WHERE  lower(s.firstName) = :name")
    List<Students> findStudentsByFirstName(String name);

    @Query("SELECT s FROM Students s WHERE  lower(s.email) = :email")
    Optional<Students> findByEmail(String email);

}
