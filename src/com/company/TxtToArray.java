package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TxtToArray {

    public static List<String> toDoItems = new ArrayList<>();

    protected void addSavedItemsToArray() throws IOException {
        Scanner itemsList = new Scanner(new FileReader("ToDoList.txt"));
        while (itemsList.hasNextLine()) {
            toDoItems.add(itemsList.nextLine());
        }

        Menu menu = new Menu();
        menu.mainMenu();
    }
}
