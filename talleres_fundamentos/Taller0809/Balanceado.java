package TalleresJava.Taller0809;

public class Balanceado {
    
    public static boolean balancear(int[] arr){
        //[1,2,78,3,0]
        int posCentral = arr.length/2+1;
        int sumaIzq = 0;
        int sumaDer = 0;
        for(int i = 0; i < posCentral; i++){
            sumaIzq += arr[i];
            sumaDer += arr[arr.length-1-i];
        }
        return sumaIzq == sumaDer;
    }
}