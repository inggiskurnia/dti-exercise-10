import utils.UserInput;

import java.util.Scanner;

public class MainMenu {
    public static void run(){

        int selectedMenu = 0;
        String loggedInUser = "";

        while(true){
            switch (selectedMenu){
                case 0 : {
                    System.out.println("************************");
                    System.out.println();
                    System.out.println("Inventory Management");
                    System.out.println();
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println();
                    System.out.println("************************");
                    selectedMenu = UserInput.inputInteger("Please select menu");
                    break;
                }
                case 1 : {
                    User.register();
                    selectedMenu = 0;
                    break;
                }
                case 2 : {
                    loggedInUser = User.login();
                    selectedMenu = 3;
                    break;
                }
                case 3 : {
                    InventoryMenu.run(loggedInUser);
                    selectedMenu = 0;
                    break;
                }
                default : {
                    System.out.println("Invalid menu !");
                    selectedMenu = 0;
                    break;
                }
            }
        }


    }
}
