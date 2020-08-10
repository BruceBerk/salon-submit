package com.manninglive.salonapi.salonservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonServiceDetailRepo extends JpaRepository<SalonServiceDetail, Long> {
}
