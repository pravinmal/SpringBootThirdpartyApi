package org.sb3rdpartyapi.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
}