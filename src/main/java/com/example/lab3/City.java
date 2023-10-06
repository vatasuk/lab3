package com.example.lab3;

public class City {
    private int pop, status, id;
    private String name;

    @Override
    public String toString() {
        return "City{" +
                "pop=" + pop +
                ", status=" + status +
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public City(int id, String name, int pop, int status) {
        this.pop = pop;
        this.status = status;
        this.id = id;
        this.name = name;
    }

}
