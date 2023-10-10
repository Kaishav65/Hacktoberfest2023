import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Welcome to your To-Do List!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a task: ");
                    scanner.nextLine(); // Consume newline
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added: " + task);
                    break;
                case 2:
                    System.out.println("\nYour To-Do List:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
