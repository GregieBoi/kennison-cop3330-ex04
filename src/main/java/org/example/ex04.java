/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex04 {

    // gets noun
    public static String getnoun() {

        // prompt input and return scan
        System.out.print("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // gets verb
    public static String getverb() {

        // prompt input and return scan
        System.out.print("Enter a verb: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // gets adjective
    public static String getadjective() {

        // prompt input and return scan
        System.out.print("Enter a adjective: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // gets adverb
    public static String getadverb() {

        // prompt input and return scan
        System.out.print("Enter a adverb: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // main
    public static void main(String[] args) {

        // gather variables
        String noun = getnoun();
        String verb = getverb();
        String adjective = getadjective();
        String adverb = getadverb();

        // print output
        System.out.printf("Do you %s your %s %s %s? That's hilarioius!", verb, adjective, noun, adverb);

    }

}
