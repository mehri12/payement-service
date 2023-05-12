package com.example.payement_service.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class payement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int payment_id;
    private int reservationId;
    @OneToOne(cascade = CascadeType.ALL)
    private CoordonneBanquaire coordonneBanquaire;
    private String payementstatus;
}
