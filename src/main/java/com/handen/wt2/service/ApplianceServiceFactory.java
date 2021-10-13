package com.handen.wt2.service;

public class ApplianceServiceFactory {
    public ApplianceService create() {
        return new ApplianceServiceImpl();
    }
}
