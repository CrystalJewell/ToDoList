package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.TxtToArray.toDoItems;

/**
 * Created by crystaladkins on 7/18/17.
 */
public class RemoveItems {

    private Scanner input = new Scanner(System.in);

//    private List<String> itemsInList = new ArrayList<>();
//
//    protected void listSavedItemsToArray() throws IOException {
//        Scanner itemsList = new Scanner(new FileReader("ToDoList.txt"));
//        while (itemsList.hasNextLine()) {
//            itemsInList.add(itemsList.nextLine());
//        }
//
//        if (itemsInList.size() > 0) {
//            showUserItemsInArray();
//        } else {
//            System.out.println("There are not items in your todo list.");
//            Menu menu = new Menu();
//            menu.mainMenu();
//        }
//    }

    protected void showUserItemsInArray() {

        for (int i = 0; i < toDoItems.size(); i++) {

            System.out.println(i + " " + toDoItems.get(i));

        }
        System.out.println("Which item would you like to remove?");

        try {
            int selectedItemNumber = input.nextInt();
            toDoItems.remove(selectedItemNumber);
            //to clear the nextInt().
            input.nextLine();
            removeMore();
        } catch (Exception ime) {
            int numberOfItems = toDoItems.size() - 1;
            System.out.println("Please select a number from 0 - " + numberOfItems);
            showUserItemsInArray();
        }

    }

    private void removeMore() {

        System.out.println("Would you like to remove more items?");
        String remove = input.nextLine();

        switch (remove) {
            case "Y":
            case "y":
                showUserItemsInArray();
                break;
            case "N":
            case "n":
                Menu menu = new Menu();
                menu.mainMenu();
                break;
            default:
                System.out.println("Please enter Y or N");
                removeMore();
                break;
        }

    }

}
