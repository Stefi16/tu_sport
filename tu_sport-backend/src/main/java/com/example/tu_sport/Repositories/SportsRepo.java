package com.example.tu_sport.Repositories;

import com.example.tu_sport.Entities.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SportsRepo extends JpaRepository<Sport, Long> {

}
