package com.ironhack.main;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        System.out.println("_______________First exercise_______________");

        int[] arrayInt = {25, 40, 82, 2, -36};
        int largest = arrayInt[0];
        int smallest = arrayInt[0];
        int smallest_1 = arrayInt[0];
        int smallest_2 = arrayInt[0];

        for(int i=0; i<arrayInt.length; i++){

            if(arrayInt[i] > largest){
                largest = arrayInt[i];
            }
            else{
                if(arrayInt[i] < smallest){
                    smallest = arrayInt[i];
                }
            }}
        System.out.println("Evaluated array: " + Arrays.toString(arrayInt));
        System.out.println("The largest number of the array is: " + largest);
        System.out.println("The smallest number of the array is: " + smallest);


        System.out.println("_______________Second exercise_______________");

        int[] arrayInt2 = {-3, -3, 82, 2, -1};
        int smallIndex = 0;
        int[] arrayIntNew = new int[arrayInt2.length-1];

        for(int i=0; i<arrayInt2.length; i++){
            if(arrayInt2[i] < smallest_1){
                smallest_1 = arrayInt2[i];
                smallIndex = i;
            }}

        for (int i = 0, k = 0; i < arrayInt2.length; i++) {
            if (i == smallIndex) {
                continue;
            }
            arrayIntNew[k++] = arrayInt2[i];
        }

        for(int i=0; i<arrayIntNew.length; i++){
            if(arrayIntNew[i] < smallest_2){
                smallest_2 = arrayIntNew[i];
            }}
        System.out.println("Evaluated array: " + Arrays.toString(arrayInt2));
        System.out.println("The smallest number of the array is: " + smallest_1);
        System.out.println("The second smallest number of the array is: " + smallest_2);


        System.out.println("_______________Third exercise_______________");
        double x=5;
        double y=2;
        double parenthesis = (4*y/5)-x;
        double resultEquation = Math.pow(x,2) + Math.pow(parenthesis,2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("The result of the equation is: " + resultEquation);
    }
}