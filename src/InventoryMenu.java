import utils.UserInput;

import java.util.ArrayList;

public class InventoryMenu {
    public static void run(String user){

        int selectedMenu = 0;
        String loggedInUser = user;
        InventorySystem.createMaterial();

        while(true){
            switch (selectedMenu){
                case 0 : {
                    System.out.println("************************");
                    System.out.println();
                    System.out.println("Inventory Management");
                    System.out.println();
                    System.out.println("1. Borrow item");
                    System.out.println("2. Return item");
                    System.out.println("3. Check history");
                    System.out.println("4. Logout");
                    System.out.println();
                    System.out.println("************************");
                    selectedMenu = UserInput.inputInteger("Please select menu");
                    System.out.println();
                    break;
                }
                case 1 : {
                    InventorySystem.borrowItem(loggedInUser);
                    System.out.println();
                    selectedMenu = UserInput.quitMenu("Press q to go back");
                    System.out.println();
                    break;
                }
                case 2 : {
                    InventorySystem.returnItem(loggedInUser);
                    System.out.println();
                    selectedMenu = UserInput.quitMenu("Press q to go back");
                    System.out.println();
                    break;
                }
                case 3 : {
                    ArrayList<String> status = InventorySystem.checkStatus(loggedInUser);
                    System.out.println();
                    selectedMenu = UserInput.quitMenu("Press q to go back");
                    System.out.println();
                    break;
                }
                case 4 : {
                    selectedMenu = 0;
                    return;
                }
                default : {
                    System.out.println("Invalid menu !");
                    System.out.println();
                    selectedMenu = 0;
                    break;
                }
            }

        }


    }
}
