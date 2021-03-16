package TalleresJava.Taller07;

import java.util.Scanner;

/*
*Teniendo <div class='name'>NOMBRE</div><div class='lastname'>APELLIDO</div><div class='lastname'>A12</div><div class='lastname'>PJ68</div>
*Cree un programa que extraiga la información de NOMBRE y APELLIDO y los muestre por pantalla concatenados
*/

public class ExtraccionProfesional{
    public static void main(String a[]){
        
        Scanner in = new Scanner(System.in);
        
        String cadena = in.nextLine();
        String nombreCompleto = "";
        
        int indexInicioNombre = cadena.indexOf("'>")+2;
        int indexFinalNombre = cadena.indexOf("<", indexInicioNombre);
        nombreCompleto += cadena.substring(indexInicioNombre, indexFinalNombre );
        
        int indexInicioApellido = cadena.indexOf("'>", indexFinalNombre) +2;
        int indexFinalApellido = cadena.indexOf("<", indexInicioApellido);
        nombreCompleto += cadena.substring(indexInicioApellido, indexFinalApellido );
        
        System.out.println(nombreCompleto);

        in.close();

    }
    /*
    *Esta forma solo funciona si solo hay dos campos a recuperar. En este caso nombre y apellido.
    *
    */
}