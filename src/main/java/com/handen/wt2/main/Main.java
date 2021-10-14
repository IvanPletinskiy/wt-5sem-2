package com.handen.wt2.main;

import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;
import com.handen.wt2.service.ApplianceService;
import com.handen.wt2.service.ApplianceServiceFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplianceService applianceService = new ApplianceServiceFactory().create();

        List<Teapot> teapots = applianceService.getTeapots();
        System.out.println("Teapots count: " + teapots.size());

        Appliance cheapestAppliance = applianceService.getCheapestAppliance();
        if(cheapestAppliance != null) {
            System.out.println("Cheapest appliance: " + cheapestAppliance.toString());
        }
    }
}