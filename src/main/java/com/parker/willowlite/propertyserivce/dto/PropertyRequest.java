package com.parker.willowlite.propertyserivce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyRequest {
    private String addressName;
    private String street;
    private String townCity;
    private String postcode;
}
