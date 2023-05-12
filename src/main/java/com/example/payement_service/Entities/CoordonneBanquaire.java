package com.example.payement_service.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CoordonneBanquaire {
    @Id
    private String numCarte;
    private int cvv;
    private LocalDate dateExpiration;
}
