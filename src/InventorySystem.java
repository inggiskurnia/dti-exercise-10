import items.Books;
import items.Dvd;
import items.Magazines;
import items.Materials;
import utils.UserInput;

import java.util.ArrayList;
import java.util.HashMap;

public class InventorySystem {
    static HashMap<String, Materials> materials = new HashMap<>();
    static ArrayList<InventoryHistory> inventoryHistory = new ArrayList<>();

    public static void borrowItem(String user){
        String loggedInUser = user;

        showAllItem();
        String itemName = UserInput.inputString("Select material name to be borrow : ");
        if(!materials.containsKey(itemName)){
            System.out.println("Invalid item name !");
            return;
        }

        int totalBorrow = UserInput.inputInteger("Input total number item to borrow");
        InventoryHistory newHistory = new InventoryHistory(itemName, loggedInUser, totalBorrow, "Borrow");
        inventoryHistory.add(newHistory);
        materials.get(itemName).setTotalAvail(-totalBorrow);
        System.out.println("Successfully borrow item !");
    }

    public static void returnItem(String user){
        String loggedInUser = user;

        ArrayList<String> borrowedItemName = checkStatus(user);
        String itemName = UserInput.inputString("Input item name to be return");
        if(!materials.containsKey(itemName)) {
            System.out.println("Invalid item name !");
            return;
        }
        int totalReturn = UserInput.inputInteger("Input total return");
        materials.get(itemName).setTotalAvail(totalReturn);

        InventoryHistory newHistory = new InventoryHistory(itemName, loggedInUser, totalReturn, "Return");
        inventoryHistory.add(newHistory);

        System.out.println("Return successfull");
    }

    public static ArrayList<String> checkStatus(String user) {
        String loggedInUser = user;
        ArrayList<String> borrowedItemName = new ArrayList<>();

        if(inventoryHistory.isEmpty()){
            System.out.println("No item borrow");
            return borrowedItemName;
        }

        for(int i=0; i<inventoryHistory.size(); i++){
            InventoryHistory history = inventoryHistory.get(i);
            if(history.getUser().equals(loggedInUser)){
                //System.out.println("ID : " + history.getId());
                System.out.println("Item name : " + history.getName());
                System.out.println("Type : " + history.getType());
                System.out.println("Total : " + history.getTotal());
                System.out.println("Date : " + history.getDate());
                borrowedItemName.add(history.getName());
                System.out.println();
            }
        }
        return borrowedItemName;
    }

    public static void createMaterial(){
        Books material1 = new Books("Atomic Habbits", 5, "Self Help");
        Magazines material2 = new Magazines("Majalah Bobo", 10, 2005);
        Dvd material3 = new Dvd("Radiohead OK Computer", 2, "music");

        materials.put(material1.getName(), material1);
        materials.put(material2.getName(), material2);
        materials.put(material3.getName(), material3);
    }

    public static void showAllItem(){
        int i = 1;
        for(Materials material : materials.values()){
            material.printAll();
            System.out.println();
            i += 1;
        }
    }
}
