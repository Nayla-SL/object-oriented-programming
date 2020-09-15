package ar.com.ada.online.second.polimorfismo;

import java.util.Objects;

public class Vehicle {

    //parameters
    protected String brand = null;
    protected String model = null;
    protected Integer year = 0;


    //constructor
    public Vehicle() {

    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;

    }


    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String technicalSheet() {
        return String.format("Brand: %s\n Model: %s\n Year: %d\n Este vehículo no tiene categoría asignada \n",
                getBrand(),
                getModel(),
                getYear());
    }

    //Overrides
    @Override
    public int hashCode() {
        return -31 * Objects.hash(brand, model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehicle that = (Vehicle) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year);
    }

    @Override
    public String toString() {
        return String.format("Vehicle{\n brand: %s\n model: %s\n, year: %d}\n",
                brand,
                model,
                year
        );
    }


}

