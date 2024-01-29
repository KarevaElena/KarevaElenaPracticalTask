package org.kareva;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(sumWithin(20,3));
        printPositiveOrNegative(-7);
        System.out.println(positiveOrNegative(5));
        printString("Lena", 3);
        System.out.println(leapYearOrNonLeapYear(2024));
        changeArray();
        createArray();
        changeArray2();
        fillDiagonal();
        System.out.println(Arrays.toString(lenArray(5,8)));
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean sumWithin(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20 ? true : false;
    }

    //2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или
    // отрицательное. Замечание: ноль считаем положительным числом.
    public static void printPositiveOrNegative(int num) {
        if(num >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    public static boolean positiveOrNegative(int num) {
        return num < 0 ? true : false;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз.
    public static void printString(String string, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(string);
        }
    }

    // 5. Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leapYearOrNonLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
    }

    // 6. Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0.
    public static void changeArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Было  " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println("Стало " + Arrays.toString(arr));
    }

     // 7. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100.
     public static void createArray() {
         int[] arr = new int[100];
         for (int i = 0; i < arr.length; i++) {
             arr[i] = i + 1;
             System.out.print(arr[i] + " ");
         }
     }

     // 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2.
     public static void changeArray2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < 6) {
                 arr[i] *= 2;
             }
         }
         System.out.println();
         System.out.println(Arrays.toString(arr));
     }

     // 9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу:
    // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n].
     public static void fillDiagonal() {
         int n = 5;
         int[][] array = new int[n][n];
         for (int i = 0; i < n; i++) {
             array[i][i] = 1;
             array[i][n - i - 1] = 1;
         }
         for (int j = 0; j < n; j++) {
             System.out.println(Arrays.toString(array[j]));
         }
     }

     // 10. Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue.
     public static int[] lenArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
     }
}
