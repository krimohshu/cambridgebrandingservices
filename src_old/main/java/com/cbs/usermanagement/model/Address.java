package com.cbs.usermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String houseNum;
    private String firstLine;
    private String secondLine;
    private String city;
    private String country;
    private String pincode;

}
