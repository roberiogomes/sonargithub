package com.example.sonargithub;

import java.util.GregorianCalendar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping(path = "/time")
    public ResponseEntity<String> getTime(){
        return ResponseEntity.ok(new GregorianCalendar().toString());
    }
}
