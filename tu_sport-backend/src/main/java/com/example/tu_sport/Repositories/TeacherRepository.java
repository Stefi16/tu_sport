package com.example.tu_sport.Repositories;

import com.example.tu_sport.Entities.Teachers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository extends JpaRepository <Teachers,Long> {

    @Query("SELECT t FROM Teachers t WHERE lower(t.firstName) = :name")
    List<Teachers> findTeachersByFirstName(String name);


    Teachers findTeacherById(Long id);
}
