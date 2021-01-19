package com.example.tu_sport.Controllers;

import com.example.tu_sport.Entities.Teachers;
import com.example.tu_sport.Repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherRepository teacherRepository;

    @GetMapping("")
    public List<Teachers> getTeachers() {

        return teacherRepository.findAll();

    }
    @GetMapping("/id")
    public Teachers getTeachers(@RequestParam Long id) {
        return teacherRepository.findTeacherById(id);
    }


    @PostMapping("/save")
    public ResponseEntity saveOrUpdateTeachers(@RequestBody Teachers form) {
        boolean isNew = teacherRepository.findByEmail(form.getEmail().toLowerCase()).isEmpty();
        Map<String, Object> s = new HashMap<>();
        if(isNew) {
            s.put("message", "Успешно записан.");
            s.put("teacher", teacherRepository.save(form));
        }
        else
        {
            s.put("message", "Успешно редактиран.");
            Optional<Teachers> t = teacherRepository.findByEmail(form.getEmail());
            teacherRepository.delete(t.orElse(null));
            s.put("teacher", teacherRepository.save(form));
        }
        return new ResponseEntity<>(s ,HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteTeacher(@RequestParam Long id) {
        Teachers teacher = teacherRepository.getOne(id);
        teacherRepository.delete(teacher);
        return ResponseEntity.ok("Успешно изтрит");
    }

    @GetMapping("/search/name")
    public List<Teachers> getTeachersName(@RequestParam(required = false) String firstName) {

        List<Teachers> result = teacherRepository.findTeachersByFirstName(firstName.toLowerCase());

        if(result.isEmpty()) {
            ResponseEntity.ok("Въведеното име не е намерено!");
        }
        else
            return result;

        return null;
    }
}
