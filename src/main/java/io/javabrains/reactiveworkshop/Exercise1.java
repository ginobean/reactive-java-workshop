package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.StreamSources.intNumbersStream;
import static io.javabrains.reactiveworkshop.StreamSources.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        intNumbersStream().forEach((v) -> System.out.printf("%s ", v));
        System.out.println();

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        intNumbersStream().filter(v -> v < 5).forEach(v -> System.out.printf("%s ", v));
        System.out.println();

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        intNumbersStream().filter(v -> v > 5).skip(1).limit(2).forEach(v -> System.out.printf("%s ", v));

        System.out.println();
        // Print the first number in intNumbersStream that's greater than 5.
        // If nothing is found, print -1
        // TODO: Write code here
        System.out.printf("1st greater than 5 : %s ", intNumbersStream().filter(v -> v > 5).findFirst().orElse(-1));
        System.out.println();

        // Print first names of all users in userStream
        // TODO: Write code here
        userStream().forEach(user -> System.out.printf("%s \n", user.getFirstName()));
        System.out.println();

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        var idsList = intNumbersStream().collect(Collectors.toList());
        var idsSet = new HashSet<Integer>(idsList);
        userStream().filter(user -> idsSet.contains(user.getId()))
                .forEach(user -> System.out.printf(">> %s \n", user.getFirstName()));

    }

}
