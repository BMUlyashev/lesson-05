package ru.skypro;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};
    }

    private static void task2() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};

        for (int i = 0; i < a.length; i++) {
            if(i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        for (int i = 0; i < b.length; i++) {
            if(i == b.length - 1) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }

        for (int i = 0; i < c.length; i++) {
            if(i == c.length - 1) {
                System.out.println(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
    }

    private static void task3() {
        int[] a = new int[]{1, 2, 3};
        double[] b = new double[] {1.57, 7.654, 9.986};
        int[] c = {23, 45, 87, 14, 94};

        for (int i = a.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }


        for (int i = b.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(b[i]);
            } else {
                System.out.print(b[i] + ", ");
            }
        }

        for (int i = c.length - 1; i >= 0; i--) {
            if(i == 0) {
                System.out.println(c[i]);
            } else {
                System.out.print(c[i] + ", ");
            }
        }
    }

    private static void task4() {
        int[] a = new int[] {1, 2, 3};
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