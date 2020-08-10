package com.manninglive.salonapi.api;

import com.manninglive.salonapi.salonservice.SalonServiceDetail;
import com.manninglive.salonapi.salonservice.SalonServiceDetailRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/services",
                produces = "application/json")
@CrossOrigin(origins = "*")
public class SalonServicesRetrieve {
    private SalonServiceDetailRepo salonServiceDetailRepo;

    public SalonServicesRetrieve(SalonServiceDetailRepo salonServiceDetailRepo) {
        this.salonServiceDetailRepo = salonServiceDetailRepo;
    }

    @GetMapping("/retrieveAvailableSalonServices")
    public Iterable<SalonServiceDetail> availableServices() {
        return salonServiceDetailRepo.findAll();
    }
}
