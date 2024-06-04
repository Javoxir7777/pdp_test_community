package com.example.demo.repo;

import com.example.demo.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ThemeRepo extends JpaRepository<Theme, UUID> {
}
