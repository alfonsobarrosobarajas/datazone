package com.datazone.repository;

import com.datazone.models.Kit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitRepository extends JpaRepository<Kit, Integer> {
}
