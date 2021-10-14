package com.handen.wt2.data;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.handen.wt2.domain.Appliance;

import java.io.Serializable;
import java.util.List;

/**
 * Required for serialization of list of appliances. 
 */
class AppliancesList implements Serializable {

    @JsonUnwrapped(enabled = false)
    List<Appliance> appliances;

    AppliancesList(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    //Don't delete, default constructor is required for serialization.
    AppliancesList() {

    }

    public List<Appliance> getAppliances() {
        return appliances;
    }
}
