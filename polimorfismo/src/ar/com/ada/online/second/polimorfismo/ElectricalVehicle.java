package ar.com.ada.online.second.polimorfismo;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency = 0;

    //constructores
    public ElectricalVehicle() {

    }

    public ElectricalVehicle(Integer potency) {
    this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.potency = potency;
    }

    //getters and setters
    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public String technicalSheet() {
        if (this.year < 2007) {
            return String.format("No existe auto para este modelo");
        } else {
            return String.format("Brand: %s\n Model: %s\n Year: %d\n Potency: %d\n Es un auto de última tecnología!\n",
                    getBrand(),
                    getModel(),
                    getYear(),
                    getPotency());
        }
    }

    //Overrides
    @Override
    public int hashCode() {
        return -31 * Objects.hash(brand, model, year, potency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year) &&
                potency.equals(that.potency);
    }

    @Override
    public String toString() {
        return String.format("Vehicle{\n brand: %s\n model: %s\n, year: %d\n potency: %d}\n",
                brand,
                model,
                year,
                potency
        );
    }

}





