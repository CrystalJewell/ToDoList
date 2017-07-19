package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.TxtToArray.toDoItems;

public class ListItems {

//    private List<String> itemsInList = new ArrayList<>();
//
//    protected void listSavedItemsToArray() throws IOException {
//        Scanner itemsList = new Scanner(new FileReader("ToDoList.txt"));
//        while (itemsList.hasNextLine()) {
//            itemsInList.add(itemsList.nextLine());
//        }
//
//        if (itemsInList.size() > 0) {
//            showTodoItems();
//        } else {
//            System.out.println("There are not items in your todo list.");
//            Menu menu = new Menu();
//            menu.mainMenu();
//        }
//    }

    protected void showTodoItems() {

        if (toDoItems.size() == 0) {
            System.out.println("There are not items in your todo list.");
        } else {
            for (String item : toDoItems) {
                System.out.println(item);
            }
        }

        Menu menu = new Menu();
        menu.mainMenu();
    }
}
