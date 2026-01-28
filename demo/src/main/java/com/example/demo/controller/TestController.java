package com.example.demo.controller;

// import com.example.petinsurance.model.Pet;
// import com.example.petinsurance.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping
    public String test() {
        return "API funcionando 🚀";
    }
}
