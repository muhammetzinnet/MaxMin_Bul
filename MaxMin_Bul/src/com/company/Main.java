package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 0;

        for (int i=1; i < 10; i++){
            System.out.print("Bir sayı giriniz = ");
            int n = input.nextInt();

            if (i == 1){
                max = n;
                min = n;
            }else {
                if (n>max)
                    max = n;

                if (n<min)
                    min = n;
            }
        }
        System.out.println("Giirilen büyük sayı = " + max);
        System.out.println("Girilen küçük sayı = " + min);
    }
}
