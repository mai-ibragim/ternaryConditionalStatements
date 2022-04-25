package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie alt sind Sie?");
	    int alt = scan.nextInt();

    String alkohol = alt >= 18 ? "Es ist möglich, Alkohol zu kaufen" : "Es ist verboten, Alkohol zu kaufen!";

        System.out.println(alkohol);
    }
}
