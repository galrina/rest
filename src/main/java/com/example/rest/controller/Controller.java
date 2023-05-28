package com.example.rest.controller;
import com.example.rest.dto.NameRequest;
import com.example.rest.dto.NameResponse;
import org.springframework.web.bind.annotation.*;
@RestController
public class Controller {
    @PostMapping("/name")
    public NameResponse getName(@RequestBody NameRequest request) {
        String fullName = request.getFirstName() + " " + request.getLastName();
        NameResponse response = new NameResponse();
        response.setFullName(fullName);
        return response;
    }
}
