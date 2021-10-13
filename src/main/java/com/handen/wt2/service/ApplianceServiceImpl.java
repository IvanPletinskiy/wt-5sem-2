package com.handen.wt2.service;

import com.handen.wt2.data.ApplianceDao;
import com.handen.wt2.data.ApplianceDaoFactory;
import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;

import java.util.List;

class ApplianceServiceImpl implements ApplianceService {

    private ApplianceDao applianceDao = new ApplianceDaoFactory().create();

    ApplianceServiceImpl() {

    }

    public List<Teapot> getTeapots() {
        return applianceDao.getTeapots();
    }

    public Appliance getCheapestAppliance() {
        return applianceDao.getCheapestAppliance();
    }
}
