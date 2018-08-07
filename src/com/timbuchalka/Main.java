package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name of birth ");
        int yearofBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character(enter key)!

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2018 - yearofBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old");
        scanner.close();
    }
}
