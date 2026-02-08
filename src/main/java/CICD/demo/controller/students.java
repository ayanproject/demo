package CICD.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class students {
    @GetMapping
   public ResponseEntity<?>getStudent(){
       return ResponseEntity.ok("This is all students :");
    }
    @GetMapping("/name")
    public ResponseEntity<?>getStudentName(){
        return ResponseEntity.ok("my name is ayan :");
    }
    @GetMapping("/card")
    public ResponseEntity<?>getStudentCard(){
        return ResponseEntity.ok("my name is card :");
    }
}
