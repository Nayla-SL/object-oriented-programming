package ar.com.ada.online.second.polimorfismo;

public class Truck extends Vehicle {

    private Integer maxLoad;


    //constructores
    public Truck() {

    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxLoad = maxLoad;
    }


    //getters and setters
    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }


    public String technicalSheet() {
        if (maxLoad < 100) {
            return String.format("brand: %s \n model: %s \n year: %d \n Para iniciar un negocio de flete, está muy bien este vehiculo\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else if (maxLoad > 101) {
            return String.format("brand: %s \n model: %s \n year: %d \n Tienes que usar este auto en el campo, es una máquina de trabajo!!\n",
                    getBrand(),
                    getModel(),
                    getYear());
        } else {
            return null;
        }
    }



}
