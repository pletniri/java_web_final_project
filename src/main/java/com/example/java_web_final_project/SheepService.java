package com.example.java_web_final_project;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SheepService {

    private final SheepRepository sheepRepository;

    public SheepService(SheepRepository sheepRepository) {
        this.sheepRepository = sheepRepository; 
    }

    public List<Sheep> all() {
        return sheepRepository.findAll();
    }

    public void add(Sheep sheep) {
        sheepRepository.save(sheep);
    }

    public Optional<Sheep> findById(int id) {

        return sheepRepository.findById(id);
    }

    public void delete(Integer id) {

        sheepRepository.deleteById(id);
    }
}
