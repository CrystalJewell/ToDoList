package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.company.TxtToArray.toDoItems;

public class ArrayToTxt {


    protected void createTxtFile () {

        try {
            Files.write(Paths.get("ToDoList.txt"), toDoItems);
        } catch (IOException ioe) {
            System.out.println("Unable to write to file");
        }
        System.exit(1);
    }
}
