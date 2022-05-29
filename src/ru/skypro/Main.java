package ru.skypro;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        /* hard tasks */
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[]{1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};
    }

    private static void task2() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[]{1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }

        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
    }

    private static void task3() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[]{1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};

        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }


        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }

        for (int i = c.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
    }

    private static void task4() {
        int[] a = new int[]{1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }

    private static void task5() {
        int[][] arr = new int[3][3];
        int value = 1;
        // Будет работать с квадратными массивами. arr.length возращает количество строк
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = value;
            arr[i][arr.length - 1 - i] = value;
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    private static void task6() {
        int[] badMatrix = new int[] {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(badMatrix));
        int[] tempMatrix = new int[5];
        for (int i = 0; i < badMatrix.length; ++i) {
            tempMatrix[badMatrix.length - 1 - i] = badMatrix[i];
        }
        for (int i = 0; i < badMatrix.length; i++) {
            badMatrix[i] = tempMatrix[i];
        }
        System.out.println(Arrays.toString(badMatrix));
    }

    private static void task7() {
        int[] badMatrix = new int[] {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(badMatrix));
        for (int i =0; i < badMatrix.length / 2; i++) {
            int tempValue = badMatrix[i];
            badMatrix[i] = badMatrix[badMatrix.length - 1 - i];
            badMatrix[badMatrix.length - 1 - i] = tempValue;
        }
        System.out.println(Arrays.toString(badMatrix));
    }

    private static void task8() {
        int[] arr = new int[] {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex != rightIndex) {
            if (arr[leftIndex] + arr[rightIndex] > sum) {
                rightIndex--;
            } else if (arr[leftIndex] + arr[rightIndex] < sum) {
                leftIndex++;
            } else {
                System.out.println("[" + arr[leftIndex] + ", " + arr[rightIndex] + "]");
                break;
            }
        }
    }

    private static void task9() {
        int[] arr = new int[] {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sum = -2;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex != rightIndex) {
            if (arr[leftIndex] + arr[rightIndex] > sum) {
                rightIndex--;
            } else if (arr[leftIndex] + arr[rightIndex] < sum) {
                leftIndex++;
            } else {
                System.out.println("[" + arr[leftIndex] + ", " + arr[rightIndex] + "]");
                leftIndex++;
                rightIndex--;
            }
        }
    }
}