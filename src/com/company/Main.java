package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {


//        AddItems addItems = new AddItems();
//        addItems.addTodoItems();

//        Menu menu = new Menu();
//        menu.mainMenu();
        try {
            TxtToArray txtToArray = new TxtToArray();
            txtToArray.addSavedItemsToArray();
        } catch (IOException ioe) {
            System.out.println("There was an error");
            Menu menu = new Menu();
            menu.mainMenu();
        }
    }
}
