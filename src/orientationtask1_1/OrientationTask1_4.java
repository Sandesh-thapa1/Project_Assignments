
package orientationtask1_1;

import java.util.LinkedList;
import java.util.Scanner;

public class OrientationTask1_4 {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 3) {

            System.out.println("\n1. Add customer");
            System.out.println("2. Remove customer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice == 1) {

                Customer customer = new Customer();
                customer.setStartTime(System.nanoTime());

                queue.addFirst(customer);

                System.out.println("Customer " + customer.getId() + " added to queue");

            } else if (choice == 2) {

                if (!queue.isEmpty()) {

                    Customer customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());

                    double waitingTime = customer.getTimeSpent() / 1000000.0;

                    System.out.println("Customer " + customer.getId() + " removed");
                    System.out.println("Waiting time: " + waitingTime + " ms");

                } else {
                    System.out.println("Queue is empty");
                }

            } else if (choice == 3) {

                System.out.println("Program ended");

            } else {

                System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
