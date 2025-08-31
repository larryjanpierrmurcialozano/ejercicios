package listas;

import java.util.ArrayList;
import java.util.List;

public class NumerosLista {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        System.out.println("conteo con for:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("Suma de la lista: " + suma);
    }
}
