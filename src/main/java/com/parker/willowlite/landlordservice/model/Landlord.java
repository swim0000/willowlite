package com.parker.willowlite.landlordservice.model;

import com.parker.willowlite.propertyserivce.model.Property;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Landlord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long landlordId;
    private String name;
    private String email;
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "property_id")
    private Property property;
}
