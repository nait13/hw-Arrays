package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 8, 4, 5, 6, 7, 3, -4};
        int[] arrayIntM = {0, 9, 18, -8, 3, 0, 6, -7, 12, 14};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr1 = {9, 9, 9};
        int[] arr2 = {1, 2, 9, 4};
        int[] arr3 = {1,2,4,9};

        outputArrayForwardReverseOrder(arrayInt);
        findMinMax();
        findIndexMinMax(arrayIntM);
        findNumberZeroElem(arrayInt);
        swapElements(arrayIntM);
        checkArray(arr);
        System.out.println(Arrays.toString(addOneToArray(arr3)));
    }

    //Task 1
    static void outputArrayForwardReverseOrder(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(" " + arrayInt[i]);
        }
        System.out.println("\n");
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(" " + arrayInt[i]);
        }
    }

    //Task 2
    static void findMinMax() {
        int[] arrayInt = {9, 18, -8, 3, 0, 6, -7, 12, 14};
        int min = arrayInt[0];
        int max = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            } else if (arrayInt[i] > max) {
                max = arrayInt[i];
            }

        }
        System.out.println("\n min " + min);
        System.out.println("\n max " + max);
    }

    //Task 3
    static void findIndexMinMax(int[] arr) {
        int minNumIndex = 0;
        int maxNumIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxNumIndex]) {
                maxNumIndex = i;
            } else if (arr[i] < arr[minNumIndex]) {
                minNumIndex = i;
            }
        }
        System.out.println("\n");
        System.out.println("Index min num " + minNumIndex);
        System.out.println("Index max num " + maxNumIndex);

    }

    //Task 4
    static void findNumberZeroElem(int[] arr) {
        int acc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                acc++;
            }
        }
        if (acc <= 0) {
            System.out.println("Нулевых элементов нет ");
        } else {
            System.out.println("Нулевых элементов: " + acc);
        }
    }

    //Task 5
    static void swapElements(int[] arr) {
        int temp = 0;
        int arrLеngth = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arrLеngth];
            arr[arrLеngth] = temp;
            arrLеngth--;

        }
        System.out.println(Arrays.toString(arr));
    }

    //Task 6
    static void checkArray(int[] arr) {
        int checkArr = 1;
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[checkArr] >= arr[i]) {
                value++;
            }
            if (checkArr < arr.length - 1) {
                checkArr++;

            }
        }
        if (value == arr.length) {
            System.out.println("Массив возврастаюзей последовательностью");
        } else {
            System.out.println("Массив не возврастающей последовательностью");
        }

    }

    //Task 7
    static int[] addOneToArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("ARR" + arr[i]);
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
