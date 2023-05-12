package com.example.payement_service.Services;

import com.example.payement_service.Entities.CoordonneBanquaire;
import com.example.payement_service.Entities.payement;
import com.example.payement_service.Repositories.CoordonneBanquaireRepo;
import com.example.payement_service.Repositories.payementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class payementService {

    @Autowired
    private payementRepo repository;

    @Autowired
    private CoordonneBanquaireRepo coordonneBanquaireRepo;

    public payement doPay(payement payment){
        CoordonneBanquaire coordonneBanquaire = coordonneBanquaireRepo.save(payment.getCoordonneBanquaire());
        payment.setPayementstatus(paymentStatus());
        payment.setCoordonneBanquaire(coordonneBanquaire);
        return repository.save(payment);
    }

    private String paymentStatus(){

        return new Random().nextBoolean()?"success":"failure";
    }
}
