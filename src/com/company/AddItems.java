package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class AddItems {


    protected void addTodoItems() {
        //Prompt user for input
        System.out.println("What would you like to add to your Todo list?");
        //Create scanner to accept input
        Scanner input = new Scanner(System.in);
        //Create variable to hold user input
        String todoItem = input.nextLine();

        try {
            Files.write(Paths.get("ToDoList.txt"), todoItem.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            System.out.println("Unable to write to file");
        }
    }

}
