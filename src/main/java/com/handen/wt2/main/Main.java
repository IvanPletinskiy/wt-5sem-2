package com.handen.wt2.main;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Freezer;
import com.handen.wt2.domain.Laptop;
import com.handen.wt2.domain.Teapot;
import com.handen.wt2.service.ApplianceService;
import com.handen.wt2.service.ApplianceServiceFactory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplianceService applianceService = new ApplianceServiceFactory().create();

        List<Teapot> teapots = applianceService.getTeapots();
        System.out.println("Teapots count: " + teapots.size());
//
//        Appliance cheapestAppliance = applianceService.getCheapestAppliance();
//        System.out.println("Cheapest appliance: " + cheapestAppliance.toString());

//        XmlMapper mapper = new XmlMapper();
//        ArrayList<Appliance> list = new ArrayList<Appliance>();
//        list.add(new Teapot(1000, 150));
//        list.add(new Laptop("Lenovo", 1000));
//        list.add(new Teapot(500, 100));
//        list.add(new Freezer(50, 500));
//        AppliancesList appliancesList = new AppliancesList(list);
//        String mappedString = "";
//        try {
//            mappedString = mapper.writeValueAsString(appliancesList);
//        }
//        catch(JsonProcessingException e) {
//            e.printStackTrace();
//        }
    }
}

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
