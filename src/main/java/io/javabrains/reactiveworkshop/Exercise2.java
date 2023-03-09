package io.javabrains.reactiveworkshop;

import io.javabrains.reactiveworkshop.ReactiveSources;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(v -> System.out.println(v));

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
