package com.example.payement_service.Repositories;

import com.example.payement_service.Entities.payement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface payementRepo extends JpaRepository<payement, Integer> {
}
