package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(v -> {
            System.out.printf("mono result = %s\n", v);
        });

        // Get the value from the Mono into an integer variable
        // TODO: Write code here
        List<Integer> results = new ArrayList<>();
        ReactiveSources.intNumberMono().subscribe(v -> {
            results.add(v);
            System.out.printf("assigned to monoResult\n");
            System.out.printf(" new results size = %s\n", results.size());
        });

        System.out.println("Press a key to end");
        System.in.read();
    }

}
