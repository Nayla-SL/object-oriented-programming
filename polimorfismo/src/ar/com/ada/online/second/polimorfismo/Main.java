package ar.com.ada.online.second.polimorfismo;

public class Main {

    public static void main(String[] args) {


        Vehicle arrayVehicle[] = new Vehicle[12];

        //Lleno el arreglo
        arrayVehicle[0] = new Vehicle("Fiat", "500", 2003);
        arrayVehicle[1] = new Vehicle("Ford", "Focus", 2005);
        arrayVehicle[2] = new Vehicle("Citroen", "C4", 2010);
        arrayVehicle[3] = new ElectricalVehicle("Tesla", "Model X", 2015, 1000);
        arrayVehicle[4] = new ElectricalVehicle("Tesla", "Model S", 2020, 5000);
        arrayVehicle[5] = new ElectricalVehicle("BMW", "i3", 2018, 3000);
        arrayVehicle[6] = new SportsVehicle("Ferrari", "F12", 2012, 500);
        arrayVehicle[7] = new SportsVehicle("Alfa Romeo", "MiTo", 2014, 303);
        arrayVehicle[8] = new SportsVehicle("LAMBORGHINI", "Coupe", 2016, 150);
        arrayVehicle[9] = new Truck("Nissan", "h50", 2010, 200);
        arrayVehicle[10] = new Truck("Mercedes Benz", "p20", 2008, 95);
        arrayVehicle[11] = new Truck("Peugeot", "500", 2008, 50);


        //mostrar el arreglo
        for (int i = 0; i < 12; i++) {
            System.out.println(arrayVehicle[i].technicalSheet());
        }

    }
}
