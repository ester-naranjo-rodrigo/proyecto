package com.ironhack.ejercicio1;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Example
        //input: [5, 4, 3, 2, 1]
        //output: [20, 12, 6, 10, 5] // Explanation 5*4, 4*3, 3*2, 1*5

        int[] numberList = {5, 4, 3, 2, 1};

        int[] numerosMultiplicados = multiplicar(numberList);
        for (int i : numerosMultiplicados) {
            System.out.println(i);
        }


        int[] numerosInvertir = invertir (numberList);
        for (int i : numerosInvertir) {
            System.out.println(i);
        }


    }


    public static int[] multiplicar(int[] arg1) {

        int[] output = new int[arg1.length];

        for (int i = 0; i < output.length; i++) {

            if (i + 1 >= output.length) {
                output[i] = arg1[i] * arg1[0];
            } else {
                output[i] = arg1[i] * arg1[i + 1];
            }


        }
        return output;

    }

    /*Example
input: [1, 2, 3, 4, 5]
output: [5, 4, 3, 2, 1]*/

    public static int[] invertir(int[] arg) {
        int[] output = new int[arg.length];
        int x = 0;

        for (int i = output.length - 1; i >= 0; i--) {
            output[x] = arg[i];
            x++;
        }

        return output;
    }
}
