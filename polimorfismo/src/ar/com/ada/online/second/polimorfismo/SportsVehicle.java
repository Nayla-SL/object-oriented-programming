package ar.com.ada.online.second.polimorfismo;

import java.util.Objects;

public class SportsVehicle extends Vehicle {
    private Integer rpm = 0;


    //constructores
    public SportsVehicle() {

    }

    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rpm = rpm;
    }


    //getters and setters
    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public String technicalSheet() {
        if (rpm > 0 && rpm < 50) {
            return String.format("brand: %s \n model: %s \n year: %d \n El auto es muy bonito, pero solo sirve para salir a pasear\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else if (rpm > 51 && rpm < 300) {
            return String.format("brand: %s \n model: %s \n year: %d \n Con este auto puedes desafiar a cualquiera en la pista\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else if (rpm > 301 && rpm < 600) {
            return String.format("brand: %s \n model: %s \n year: %d \n Si tienes este auto, debe considerar participar en NASCAR\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else if (rpm > 601){
            return String.format("brand: %s \n model: %s \n year: %d \n ¿Eres parte del elenco de rápidos y furiosos?”\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else {
            return null;
        }
    }

    //Overrides
    @Override
    public int hashCode() {
        return -31 * Objects.hash(brand, model, year, rpm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SportsVehicle that = (SportsVehicle) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                year.equals(that.year) &&
                rpm.equals(that.rpm);
    }

    @Override
    public String toString() {
        return String.format("Vehicle{\n brand: %s\n model: %s\n, year: %d\n potency: %d}\n",
                brand,
                model,
                year,
                rpm);
    }



}
