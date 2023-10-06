package com.example.lab3;

public class Park {
    int id, cityID, S, type;
    String name,date;

    @Override
    public String toString() {
        return "Park{" +
                "id=" + id +
                ", cityID=" + cityID +
                ", S=" + S +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", water=" + water +
                '}';
    }

    int water;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Park(int id, int cityID, int s, int water, int type, String name, String date) {
        this.id = id;
        this.cityID = cityID;
        this.S = s;
        this.water = water;
        this.type = type;
        this.name = name;
        this.date = date;
    }
}