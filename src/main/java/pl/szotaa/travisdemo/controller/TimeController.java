package pl.szotaa.travisdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public ResponseEntity<String> getTime(){
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
