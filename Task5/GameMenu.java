import java.util.ArrayList;
import java.util.Scanner;

class GameMenu {
    private ArrayList<String> actions; 

    // Constructor
    public GameMenu(ArrayList actions) {
        this.actions = actions;
    }

    // Methods
    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }

    public String promptUser() {
        System.out.println("Type a number to choose an action.");
        for (String action : actions) {
            System.out.println(action);
        }
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        return choice;
    }
}