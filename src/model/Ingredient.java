package model;

public class Ingredient {
    long id;
    String name;
    String unit;
    Double cost;

    public Ingredient() {
    }

    public Ingredient(long id, String name, String unit, Double cost) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.cost = cost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
}
