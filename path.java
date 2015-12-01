package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(strings("Мама мыла раму", "Мама", "раму"));
        System.out.print(s(10));
        System.out.print(perimeter(12.5));
        leapUnleapYear(2000);
        System.out.print(daysInMonth(4, 2000));



    }


    public static boolean leapUnleapYear(int year) {
        Scanner scanner = new Scanner(System.in);
        String leapYear = "Этот год високосный";
        String commonYear = "Этот не невисокосный";
        int residue = year % 4;        /*System.out.println(residue);*/
        int residue2 = year % 400;       /*System.out.println(residue2);*/
        if (year % 100 == 0) {
            if (residue == 0 && residue2 == 0) {
                System.out.println(leapYear);
                return true;
            } else {
                System.out.println(commonYear);
                return false;
            }
        } else {
            if (residue == 0) {
                System.out.println(leapYear);
                return true;
            } else {
                System.out.println(commonYear);
                return false;
            }
        }
    }
    public static int daysInMonth(int month, int year) {
        if (month == 2) {
            if (leapUnleapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else {
                return 31;
            }
        }
    }
    public static double perimeter(double radius){
        return radius*2*Math.PI;

    }
    public static double s(double diameter) {
        return Math.pow(diameter, 2) * Math.PI;
    }
    public static boolean strings(String A, String B, String C ){
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        if ((A.indexOf(B) >= 0) && (A.indexOf(C) >= 0)) {
            return true;
        } else return false;


    }

}
