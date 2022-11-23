package com.parker.willowlite.landlordservice.repository;

import com.parker.willowlite.landlordservice.model.Landlord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandlordRepository extends JpaRepository<Landlord,Long> {
}
