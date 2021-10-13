package com.handen.wt2.data;

import com.handen.wt2.domain.Appliance;
import com.handen.wt2.domain.Teapot;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

class ApplianceDaoImpl implements ApplianceDao {

    public List<Teapot> getTeapots() {
        File file = new File("C:\\Projects\\jwd-task01-template_v2\\src\\main\\resources\\appliances.xml");
        try {
            String context = new BufferedReader(new FileReader(file)).lines().collect(Collectors.joining());
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(context)));
            Element root = doc.getDocumentElement();
            root.getChildNodes();
        }
        catch(ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Appliance getCheapestAppliance() {
        return null;
    }
}
