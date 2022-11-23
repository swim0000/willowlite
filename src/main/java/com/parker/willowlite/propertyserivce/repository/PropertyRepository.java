package com.parker.willowlite.propertyserivce.repository;

import com.parker.willowlite.propertyserivce.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property,Long> {
}
