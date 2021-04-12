package TalleresJava.Taller0809;

public class Array1 {
 
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(sumaDiagonal(arr)); 
    }

    static int sumaDiagonal(int[][] arr){
        int suma = 0;

        for (int i = 0; i < arr.length; i++) {
            suma += arr[i][i];
        }

        return suma;
    }
}
