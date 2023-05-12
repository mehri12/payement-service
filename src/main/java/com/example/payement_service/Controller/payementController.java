package com.example.payement_service.Controller;

import com.example.payement_service.Entities.payement;
import com.example.payement_service.Services.payementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment/")
public class payementController {
    @Autowired
    public payementService service;

    @PostMapping("/doPay/")
    public payement doPayment(@RequestBody payement payment){
        return service.doPay(payment);
    }
}
