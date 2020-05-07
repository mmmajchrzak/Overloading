package com.company;

public class Main {

    public static void main(String[] args) {
        Exc lab = new Exc(8, 8);
        System.out.println(lab.mathOperationSum());
        System.out.println(lab.mathOperationSum(-6));

        Exc lab1 = new Exc(1);
        System.out.println(lab1.mathOperationMultiplication(2, 9));
        System.out.println(lab1.mathOperationSum(6));

        Exc lab2 = new Exc();
        System.out.println(lab2.mathOperationDivision(144,12));
        System.out.println(lab2.mathOperationDivision(6,2));

    }
}

class Exc {
    int a, b;

    public Exc() {
    }

    public Exc(int a) {
        this.a = a;
    }

    public Exc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int mathOperationSum() {
        return a + b;
    }

    public int mathOperationSum(int a) {
        return a + b;
    }

    public int mathOperationMultiplication(int a, int b) {
        return a * b;
    }

    public int mathOperationDivision(int a, int b) {
        return a / b;
    }
}