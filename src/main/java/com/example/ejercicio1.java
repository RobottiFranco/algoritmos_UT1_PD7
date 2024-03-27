package com.example;

public final class ejercicio1 {

    public static void main(String[] args) {
        String s = "1";
        while (!"1000".equals(s)) {
            s += "0";
            System.out.println(s);
        }

        s = "1";
        while (s != "1000") {
            s += "0";
        }

        /*
         * En Java, el operador == cuando se utiliza con objetos, compara las
         * referencias de los objetos en lugar de sus valores. En este caso, "1000" es
         * un literal de cadena que crea un nuevo objeto String en cada iteración del
         * bucle, mientras que s es una referencia a un objeto String que cambia en cada
         * iteración al concatenar "0"
         *
         *
         * en C#, el operador == para objetos de tipo string se comporta de manera
         * diferente. En C#, el operador == para cadenas compara los valores de las
         * cadenas en lugar de las referencias de los objetos.
         */
    }
}
