package com.company;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by crystaladkins on 7/19/17.
 */
public class Menu {

    private Scanner input = new Scanner(System.in);

    protected void mainMenu() {

        System.out.println("What would you like to do today? \n1. Add items to list. \n2. Remove items from list \n3. List items in todo list \n4. Exit");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                AddItems addItems = new AddItems();
                addItems.addTodoItems();
                break;
            case 2:
                RemoveItems removeItems = new RemoveItems();
                removeItems.showUserItemsInArray();
                break;
            case 3:
                ListItems listItems = new ListItems();
                listItems.showTodoItems();
                break;
            case 4:
                System.out.println("Thank you for using the Todo List!");
                System.exit(1);
                break;
            default:
                System.out.println("Please enter a number from 1 - 4");
        }
    }
}
