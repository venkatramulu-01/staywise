package com.staywise.staywise.controller;

import com.staywise.staywise.entity.PG;
import com.staywise.staywise.repository.PGRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pgs")
public class PGController {

    private final PGRepository pgRepository;

    public PGController(PGRepository pgRepository) {
        this.pgRepository = pgRepository;
    }

    @PostMapping
    public PG addPG(@RequestBody PG pg) {
        return pgRepository.save(pg);
    }

    @GetMapping
    public List<PG> getAllPGs() {
        return pgRepository.findAll();
    }

    @GetMapping("/search")
    public List<PG> searchByCity(@RequestParam String city) {
        return pgRepository.findByCityContainingIgnoreCase(city);
    }
}