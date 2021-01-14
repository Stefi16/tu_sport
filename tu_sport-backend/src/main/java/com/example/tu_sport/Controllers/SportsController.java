package com.example.tu_sport.Controllers;

import com.example.tu_sport.Entities.Sport;
import com.example.tu_sport.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/sports")
public class SportsController {

    @Autowired
    SportsRepo sportsRepo;

    @GetMapping("")
    public List<Sport> getSport() {
        return sportsRepo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public  String getSport(@PathVariable("id") Long id) {return sportsRepo.findById(id).toString();}

    @PutMapping("/save")
    public  Sport saveOrUpdateSports(@RequestBody Sport sport) {
        sportsRepo.save(sport);
        return  sport;
    }

    @DeleteMapping("/{aid}")
    public String deleteSport(@PathVariable("id") Long id) {
        Sport sport = sportsRepo.getOne(id);
        sportsRepo.delete(sport);
        return "deleted";
    }
}
