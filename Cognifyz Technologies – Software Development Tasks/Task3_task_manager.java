import java.util.ArrayList;
import java.util.Scanner;

public class Task3_task_manager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("\n1. Add");
            System.out.println("2. View");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("⚠️ Please enter a valid number!");
                scanner.nextLine(); // discard invalid input
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task name: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                }
                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("(no tasks found)");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ": " + tasks.get(i));
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter index to update: ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        scanner.nextLine();
                        if (index >= 0 && index < tasks.size()) {
                            System.out.print("Enter new name: ");
                            String newName = scanner.nextLine();
                            tasks.set(index, newName);
                        } else {
                            System.out.println("⚠️ Invalid index.");
                        }
                    } else {
                        System.out.println("⚠️ Please enter a number.");
                        scanner.nextLine();
                    }
                }
                case 4 -> {
                    System.out.print("Enter index to delete: ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                        } else {
                            System.out.println("⚠️ Invalid index.");
                        }
                        scanner.nextLine();
                    } else {
                        System.out.println("⚠️ Please enter a number.");
                        scanner.nextLine();
                    }
                }
                case 5 -> {
                    System.out.println("Exiting...");
                    break;
                }
                default -> System.out.println("⚠️ Invalid choice. Please try again.");
            }

            if (choice == 5) break;
        }

        scanner.close();
    }
}



