package com.example;

public class ejercicio2 {

    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";

        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        /*
         * fragmento 1: Este reultado da true ya que cuando se utiliza el operador ==
         * con objetos (en este caso, objetos String), se compara las referencias de los
         * objetos en la memoria, no sus valores. En Java, los literales de cadenas
         * (como "Hola") se almacenan en un área especial de la memoria
         */

        s1 = new String("Hola");
        s2 = "Hola";
        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        /*
         * fragmento 2: El resultado es falso ya que s1 está siendo creado
         * explícitamente como un nuevo objeto String mediante el operador new, lo que
         * significa que se crea un nuevo objeto en el heap de la memoria,
         * independientemente del pool de cadenas. Por lo tanto, aunque el contenido de
         * s1 y s2 sea el mismo, las referencias de los objetos son diferentes, y el if
         * imprime "False".
         */

        /*
         * fuente:
         * https://docs.oracle.com/javase/tutorial/java/data/comparestrings.html
         */
    }
}
