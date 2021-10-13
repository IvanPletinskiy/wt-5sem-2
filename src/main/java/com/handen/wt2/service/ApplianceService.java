package com.handen.wt2.service;

import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;

import java.util.List;

public interface ApplianceService {

    List<Teapot> getTeapots();
    Appliance getCheapestAppliance();
}
