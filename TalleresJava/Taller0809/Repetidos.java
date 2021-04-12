package TalleresJava.Taller0809;

import java.util.ArrayList;

public class Repetidos {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(1);
        detectorDeRepetidos(lista);
    }

    static void detectorDeRepetidos(ArrayList<Integer> a) {
        int cantRepetidos = 0;
        int item;
        // [1,1,4,1,4,1,1]
        int i = 0;
        while (i < a.size()) {
            item = a.get(i);
            int length = 1;
            while (i + length < a.size()) {
                if (item != a.get(i + length)) {
                    break;
                }
                length++;
            }
            if (length > 1) {
                cantRepetidos++;
                
            }
            i += length;
        }

        System.out.println(cantRepetidos);
    }
}