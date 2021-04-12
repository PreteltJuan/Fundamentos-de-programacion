package TalleresJava.Taller0809;

public class Array2 {
    
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        arr[0][0] = 1; 
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;

        transpuesta(arr);
    }

    static void transpuesta(int[][] arr){
        int[][] arr2 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr2[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }

        
    }
}
