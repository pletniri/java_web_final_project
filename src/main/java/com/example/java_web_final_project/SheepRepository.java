package com.example.java_web_final_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheepRepository extends JpaRepository<Sheep, Integer> {
}
