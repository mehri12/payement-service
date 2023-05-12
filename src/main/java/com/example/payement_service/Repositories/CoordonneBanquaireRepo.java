package com.example.payement_service.Repositories;

import com.example.payement_service.Entities.CoordonneBanquaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordonneBanquaireRepo extends JpaRepository<CoordonneBanquaire, String> {
}
