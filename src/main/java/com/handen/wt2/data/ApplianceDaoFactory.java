package com.handen.wt2.data;

public class ApplianceDaoFactory {

    public ApplianceDao create() {
        return new ApplianceDaoImpl();
    }
}
