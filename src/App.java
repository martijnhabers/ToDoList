import java.util.ArrayList;
import java.util.Scanner;


public class App {
    static ArrayList<TodoItem> taskList = new ArrayList<TodoItem>();
    static Scanner input = new Scanner(System.in);
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    static int id = 0;
    public static void main(String[] args) throws Exception {
        int choice;

        do {   
            clearScreen();
            System.out.println("Main Menu");
            // System.out.println("");
            System.out.println("(1) Add a task ");
            System.out.println("(2) Remove a task ");
            System.out.println("(3) Edit a task ");
            System.out.println("(4) List all tasks ");
            System.out.println("(0) Exit ");
            System.out.println();
            choice = Integer.parseInt(input.nextLine());

            if (choice < 0 || choice > 4) {
                System.out.println("Please enter a valid number");
                break;
            }
            switch(choice){
                case 1: {
                    addTask();
                    System.out.println();
                    input.nextLine();
                    break;
                }
                case 2: {
                    removeTask();
                    // choice = Integer.parseInt(input.nextLine());
                    break;
                }
                case 3: {
                    updateTask();
                    // choice = Integer.parseInt(input.nextLine());
                    break;
                }
                case 4: {
                    listTask();
                    input.nextLine();
                    break;
                }
           }
        }
        while(choice > 0);
    }

    private static void listTask() {
        clearScreen();
        System.out.println("Here's what you have to do:");
        int loop_len = taskList.size();
        for(int i = 0; i < loop_len; i++){
            System.out.println(taskList.get(i).getId() + ": " + taskList.get(i).getName());
        }
        
    }

    private static void updateTask() {
    }

    private static void removeTask() {
        int loop_len = taskList.size();
        for(int i = 0; i < loop_len; i++){
            if( System.out.println(taskList.get(i).getId() + ": " + taskList.get(i).getName()) ) 
        }
    }

    private static void addTask() {
        clearScreen();
        TodoItem task = new TodoItem();
        System.out.println("What do you want to do? : ");
        String name = input.nextLine();
        task.setName(name);
        task.setId(id);
        id++;
        taskList.add(task);
        System.out.println("Task \"" + name + "\" added.");
        

        //TODO: Add date, complete, and id to this method
    }

}
