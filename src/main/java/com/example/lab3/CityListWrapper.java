package com.example.lab3;


import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "cities")
public class CityListWrapper {

    private List<City> cities;

    @XmlElement(name = "city")
    public List<City> getcities() {
        return cities;
    }

    public void setcities(List<City> cities) {
        this.cities = cities;
    }
}
