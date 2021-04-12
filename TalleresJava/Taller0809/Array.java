package TalleresJava.Taller0809;

public class Array {
    
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(minimoBuscado(arr)); 
    }

    static int minimoBuscado(int[][] arr ){
        int minimo = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( minimo > arr[i][j]) {
                    minimo = arr[i][j];
                }
            }
        }

        return minimo;
    }
}
