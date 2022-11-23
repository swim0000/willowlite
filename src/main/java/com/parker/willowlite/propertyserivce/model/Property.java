package com.parker.willowlite.propertyserivce.model;

import com.parker.willowlite.landlordservice.model.Landlord;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long propertyId;
    private String addressName;
    private String street;
    private String townCity;
    private String postcode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "landlord_id")
    private Landlord landlord;

}
