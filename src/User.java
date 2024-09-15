import utils.UserInput;

import java.util.HashMap;

public class User {
    static HashMap<String, String> user = new HashMap<>();

    public static void  register(){
        String inputtedUsername = UserInput.inputString("Input new username");
        if (user.containsKey(inputtedUsername)){
            System.out.println("User already exist !");
            return;
        }
        String inputtedPassword = UserInput.inputString("Input new password");
        user.put(inputtedUsername, inputtedPassword);
        System.out.println("New user successfully created !");
    }

    public static String login() {
        String inputtedUsername = UserInput.inputString("Input username");
        if (!user.containsKey(inputtedUsername)){
            System.out.println("User not found !");
            return "";
        }
        String inputtedPassword = UserInput.inputString("Input password");
        if(!user.get(inputtedUsername).equals(inputtedPassword)){
            System.out.println("Password is incorrect !");
            return "";
        }
        return inputtedUsername;
    }
}
