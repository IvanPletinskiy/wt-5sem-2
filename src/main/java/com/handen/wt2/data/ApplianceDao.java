package com.handen.wt2.data;

import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;

import java.util.List;

public interface ApplianceDao {
    List<Teapot> getTeapots();
    Appliance getCheapestAppliance();
}
