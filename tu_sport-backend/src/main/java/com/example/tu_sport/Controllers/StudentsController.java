package com.example.tu_sport.Controllers;

import com.example.tu_sport.Entities.Courses;
import com.example.tu_sport.Entities.Students;
import com.example.tu_sport.Repositories.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    StudentsRepo studentsRepo;

    @GetMapping("")
    public List<Students> getStudents() {
        
        return studentsRepo.findAll();

    }
    @GetMapping("/search/name")
    public  List<Students> getStudentsName(@RequestParam(required = false) String firstName) {
        List<Students> result = studentsRepo.findStudentsByFirstName(firstName.toLowerCase());

        if(result.isEmpty()) {
            ResponseEntity.ok("Въведеното име не е намерено!");
        }
        else
            return  result;

        return  null;
    }

    @PutMapping("/save")
    public  ResponseEntity saveOrUpdateStudents(@RequestBody Students form) {
        boolean isNew = form.getId() == null;
        Map<String, Object> p = new HashMap<>();
        p.put("student", studentsRepo.save(form));
        if(isNew) {
            p.put("message", "Успешно записан!");
        }
        else
        {
            p.put("message", "Успешно редактиран!");
        }
        return  new ResponseEntity<>(p , HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteStudent(@RequestParam Long id) {
        Students student = studentsRepo.getOne(id);
        studentsRepo.delete(student);
        return ResponseEntity.ok("Успешно изтрит!");
    }
}
