/*A simple java program demonstrating a Queue data structure. 
 * No pre-defined functions available in a library were used.
 * The execution of the program is strictly menu driven.
 */

import java.util.*;
public class QueueProgram {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                    break;

                case 2:
                    int dequeuedItem = queue.dequeue();
                    if (dequeuedItem != -1)
                        System.out.println("Dequeued: " + dequeuedItem);
                    break;

                case 3:
                    int peekItem = queue.peek();
                    if (peekItem != -1)
                        System.out.println("Peek: " + peekItem);
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        scanner.close();
    }
}
