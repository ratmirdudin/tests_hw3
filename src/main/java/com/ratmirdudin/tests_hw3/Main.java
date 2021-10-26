package com.ratmirdudin.tests_hw3;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ratmirdudin.tests_hw3.controller.ApplicationModule;
import com.ratmirdudin.tests_hw3.controller.Library;
import com.ratmirdudin.tests_hw3.controller.LibraryFactory;
import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(@NotNull String[] args) {
        String filePath;
        int capacity;

        if (args.length != 2) {
            args = args[0].split(" ");
            if (args.length != 2) {
                System.out.println("***************WARNING***************");
                System.out.println("Please, start program with arguments = *filePath* *capacity* ");
                System.out.println("You can use and set up a special task \"runMainClass\" of group \"launch\".");
                System.out.println("*************************************");
                return;
            }
        }

        try {
            capacity = Integer.parseInt(args[1].trim());
        } catch (NumberFormatException exception) {
            System.out.println("The second argument must be a number");
            return;
        }

        filePath = args[0];
        Injector injector = Guice.createInjector(new ApplicationModule());
        System.out.println(args[0] + " " + args[1]);

        Library library = injector.getInstance(LibraryFactory.class).createLibrary(filePath, capacity);
    }
}
