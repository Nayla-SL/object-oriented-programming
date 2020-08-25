package ar.com.ada.online.second.objectexercisetwo;

public class Main {

    public static void main(String[] args) {


        Animal cat = new Animal();
        Person person1 = new Person();
        Vehicle car = new Vehicle();

        cat.breed = "Siames";
        cat.color = "gris";
        cat.name = "Pistacho";


        person1.age = 21;
        person1.name = "Nayla";
        person1.lastName = "Saenz Lopez";


        car.brand = "BMW";
        car.color = "Negro";
        car.maxSpeed = 200;


        System.out.println("Raza: " + cat.breed + ". Color: " + cat.color + ". Nombre: " + cat.name);
        cat.sleep();

        System.out.println("Nombre Completo: " + person1.name + " " + person1.lastName + ". Edad: " + person1.age);
        person1.sing();

        System.out.println("Marca: " + car.brand + ". Color: " + car.color + ". Maxima Velocidad: " + car.maxSpeed);
        car.moveOn();


    }
}
