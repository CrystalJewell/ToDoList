package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.TxtToArray.toDoItems;

/**
 * Created by crystaladkins on 7/17/17.
 */
public class AddItems {

//    //By Using array we have to say how many items will be in it before we even use it.
//    Array[] toDoItems = new Array[10];

    //    //ArrayList works like an array only you can add and remove items without having to declare its size before hand.
//    private List<String> toDoItems = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    protected void addTodoItems() {
        System.out.println("What would you like to add to your list of things todo?");
        String item = input.nextLine();
        toDoItems.add(item);

        addMoreItems();
    }

    private void addMoreItems() {
        System.out.println("Would you like to add more items to your list?");
        String addMore = input.nextLine();

        if (addMore.toUpperCase().equals("Y")) {
            addTodoItems();
        } else if (addMore.toUpperCase().equals("N")) {
            Menu menu = new Menu();
            menu.mainMenu();
        }
    }
}
