package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] a = {1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = new int[15];
    }

    public static void task2() {
        int[] a = {1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = new int[] {23, 45, 87, 14, 94};

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);

        for (int i = 0; i < b.length - 1; i++) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[b.length - 1]);

        for (int i = 0; i < c.length - 1; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.println(c[c.length - 1]);
    }

    public static void task3() {
        int[] a = {1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = new int[] {23, 45, 87, 14, 94};

        for (int i = a.length - 1; i > 0; i--) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[0]);

        for (int i = b.length - 1; i > 0; i--) {
            System.out.print(b[i] + ", ");
        }
        System.out.println(b[0]);

        for (int i = c.length - 1; i > 0; i--) {
            System.out.print(c[i] + ", ");
        }
        System.out.println(c[0]);
    }

    public static void task4() {
        int[] a = {1, 2, 3, 4, 5, 7, 9};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            if(i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}