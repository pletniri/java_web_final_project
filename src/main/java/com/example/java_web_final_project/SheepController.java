package com.example.java_web_final_project;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sheep")
public class SheepController {
    @Autowired
    private final SheepService sheepService;

    public SheepController(@Autowired SheepService sheepService) {
        this.sheepService = sheepService;
    }

    @CrossOrigin("*")
    @GetMapping
    public List<Sheep> getSheeps() {
        return sheepService.all();
    }
    @CrossOrigin("*")
    @PostMapping
    public void addSheep(@RequestBody Sheep sheep) {
        sheepService.add(sheep);
    }

    @CrossOrigin("*")
    @PutMapping
    public void updateSheep(@RequestBody SheepDto sheepDto,
                            @PathVariable Integer id) {
        Sheep sheep = sheepService.findById( id ).get();
        sheep.setName( sheepDto.getName() );
        sheep.setColor( sheepDto.getColor() );

        sheepService.add( sheep );
    }

    @CrossOrigin("*")
    @DeleteMapping
    public void delete (@PathVariable Integer id) {
        sheepService.delete(id);
    }
}
