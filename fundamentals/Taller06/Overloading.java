package TalleresJava.Taller06;

public class Overloading {
    
    public static void mostrar(String parametro){
        System.out.println("Se ha ingresado un string");
    }

    public static void mostrar(int parametro){
        System.out.println("Se ha ingresado un entero");
    }

    public static void mostrar(double parametro){
        System.out.println("Se ha ingresado un double");
    }

    public static void mostrar(char parametro){
        System.out.println("Se ha ingresado un caracter");
    }
}
