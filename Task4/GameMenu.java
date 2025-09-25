import java.util.ArrayList;

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
}