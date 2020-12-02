package ru.phule.lesson1;

public class Main {
    public static void main(String[] args) {
        // 2. Data types

        // Logic
        boolean someBool = true;

        //Numeric
        byte someByte = 5;
        short someShort = 199;
        int someInt = 5000;
        long someLong = 123456789077L;
        float someFloat = 0.55f;
        double someDouble = 123456.456456;

        // Text
        char someChar = 'A';
        String someString = "Hello World!";
    }

    // 3. Calc method
    public static double calc(double a, double b, double c,double d) {
        return a * (b + (c / d));
    }

    // 4. Is sum in range method
    public static boolean isSumInRange(double a, double b) {
        return (a + b >= 10 && a + b <= 20);
    }

    // 5. Is number positive or negative
    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Number " + a + " is positive");
        } else {
            System.out.println("Number " + a + " is negative");
        }
    }

    // 6. Is number negative
    public static boolean isNegative(int a) {
        return a < 0;
    }

    // 7. Say "hi"
    public static void sayHi(String name) {
        System.out.println("Привет, " + name);
    }

    // 8. Check year
    public static boolean isYearLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
