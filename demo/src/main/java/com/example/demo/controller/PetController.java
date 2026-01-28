package com.example.demo.controller;

// import com.example.demo.model.Pet;
// import com.example.demo.service.PetService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    
    @GetMapping
    public List<String> getPets() {
        return List.of("Fido", "Luna", "Milo");
    }
/*
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }
    @PostMapping
    public Pet addPet(@RequestBody Pet pet) {
        return petService.addPet(pet);
    }*/
}
