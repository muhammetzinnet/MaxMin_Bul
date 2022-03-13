package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,m;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        m = input.nextInt();

        int number = n;
        int ebob = 1;
        int ekok = 1;

        while (number > 1){
            if (n%number == 0 && m%number == 0){
                ebob = number;

                ekok = (n * m)/ebob;
                break;
            }
            number--;
        }

        System.out.println("Ebob değeri : " + ebob + "\nEkok değeri: " + ekok);
    }
}
