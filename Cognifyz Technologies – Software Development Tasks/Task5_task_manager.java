import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task5_task_manager {
    static final String FILE_NAME = "tasks.txt";
    static ArrayList<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadTasks();

        int choice;
        do {
            System.out.println("\n1. Add");
            System.out.println("2. View");
            System.out.println("3. Save & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> {
                    saveTasks();
                    System.out.println("Tasks saved. Exiting...");
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }

    static void loadTasks() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    tasks.add(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }

    static void addTask() {
        System.out.print("Enter task name: ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("(No tasks found)");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    static void saveTasks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                bw.write(task);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}


