package ar.com.ada.online.second.parameters;

public class Main {

    public static void main(String[] args) {
        m1();
    }

    private static void m1 (){
        int a = 20;
        System.out.printf("valor de a antes de llamar al m2: %d\n ", a);
        m2 (a);
        System.out.printf("valor de a despues de llamar al m2: %d\n ", a);
    }
    private static void m2 (int b){
        System.out.printf("valor de b al iniciar m2: %d\n ", b);
        boolean c = true;
        b++;
        System.out.printf("valor de b al finalizar m2: %d\n ", b);
    }

}
