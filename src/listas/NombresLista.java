package src.listas;

import java.util.ArrayList;
import java.util.List;

public class NombresLista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofía");

        System.out.println("Impresión con for:");
        for (String s : nombres) {
            System.out.println(s);
        }
        System.out.println("Impresión con foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Impresión con while:");
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}
