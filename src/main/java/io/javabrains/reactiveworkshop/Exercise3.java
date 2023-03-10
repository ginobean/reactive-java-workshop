package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here
        var results = ReactiveSources.intNumbersFlux().buffer();

        results.subscribe(list -> {
            System.out.println(" finally got results ");
            System.out.printf("list size was %s\n", list.size());

            for (var e : list) {
                System.out.println(e);
            }

        });

        System.out.println("Press a key to end");
        System.in.read();
    }

}
