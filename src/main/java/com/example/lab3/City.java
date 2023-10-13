package com.example.lab3;

public class City {
    private int pop, id;
    private String name;

    public City() {

    }

    @Override
    public String toString() {
        return "City{" +
                "pop=" + pop +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City(int id, String name, int pop) {
        this.pop = pop;
        this.id = id;
        this.name = name;
    }

}
