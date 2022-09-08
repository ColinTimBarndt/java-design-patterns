package io.github.colintimbarndt.builder;

import java.util.Calendar;

import static java.util.Calendar.APRIL;

public class Main {
    public static void main(String[] args) {
        var profile = UserProfile.builder("marcus123")
                .firstName("Marcus")
                .lastName("Mustermann")
                .dateOfBirth(
                        new Calendar.Builder()
                                .setDate(2002, APRIL, 9)
                                .build().getTime()
                )
                .build();
        System.out.println(profile);
    }
}
