package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        ReactiveSources.intNumbersFlux().subscribe(v -> System.out.printf(" %s ", v));
        System.out.println();

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here

        ReactiveSources.userFlux().subscribe(user -> System.out.printf(" user = %s ", user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
