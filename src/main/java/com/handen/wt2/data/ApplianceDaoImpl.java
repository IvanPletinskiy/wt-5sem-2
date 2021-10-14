package com.handen.wt2.data;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class ApplianceDaoImpl implements ApplianceDao {

    public List<Teapot> getTeapots() {
        File file = new File("C:\\Projects\\jwd-task01-template_v2\\src\\main\\resources\\appliances.xml");

        try {
            String content = new BufferedReader(new FileReader(file)).lines().collect(Collectors.joining());
            XmlMapper mapper = new XmlMapper();
            AppliancesList list = mapper.readValue(content, AppliancesList.class);
            List<Appliance> appliances = list.getAppliances();
            List<Teapot> teapots = new LinkedList<>();
            for(Appliance appliance : appliances) {
                if(appliance instanceof Teapot) {
                    teapots.add((Teapot) appliance);
                }
            }
            return teapots;
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    public Appliance getCheapestAppliance() {
        File file = new File("C:\\Projects\\jwd-task01-template_v2\\src\\main\\resources\\appliances.xml");

        try {
            String content = new BufferedReader(new FileReader(file)).lines().collect(Collectors.joining());
            XmlMapper mapper = new XmlMapper();
            AppliancesList list = mapper.readValue(content, AppliancesList.class);
            List<Appliance> appliances = list.getAppliances();
            Optional<Appliance> cheapest = appliances.stream().min(Comparator.comparingInt(Appliance::getPrice));
            return cheapest.orElse(null);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
