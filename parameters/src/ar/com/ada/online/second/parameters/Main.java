package ar.com.ada.online.second.parameters;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // m1();
        Person nayla = new Person("Nayla", 22);
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.printf("(main) Nombre Inicial: %s\n", nayla.getName());
        changeName(nayla);
        System.out.printf("(main) Nombre Final: %s\n", nayla.getName());

    }

    // ########## paso de variables primitivas
    private static void m1() {
        int a = 20;
        System.out.printf("valor de a antes de llamar al m2: %d\n ", a);
        m2(a);
        System.out.printf("valor de a despues de llamar al m2: %d\n ", a);
    }

    private static void m2(int b) {
        System.out.printf("valor de b al iniciar m2: %d\n ", b);
        boolean c = true;
        b++;
        System.out.printf("valor de b al finalizar m2: %d\n ", b);
    }


    //########## paso re variables por referencia

    public static void changeName (Person person){
        System.out.printf("(change name) Nombre inicial: %s\n", person.getName());
        // Caso 1
        //person = new Person("Paulina", 25);

        // Caso 2
        person.setName("Paulina");
        System.out.printf("(change name) Nombre cambiado: %s\n", person.getName());
    }

}
