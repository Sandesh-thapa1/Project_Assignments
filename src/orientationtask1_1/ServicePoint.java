
package orientationtask1_1;

import java.util.LinkedList;

public class ServicePoint {

    private LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueueue(Customer customer) {
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
    }

    public Customer removeFromQueueue() {
        return queue.removeLast();
    }

    public void serve() {

        while (!queue.isEmpty()) {

            Customer customer = removeFromQueueue();

            long sleepTime = (long) (Math.random() * 400) + 100;

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }

            customer.setEndTime(System.nanoTime());

            double responseTime = customer.getTimeSpent() / 1000000.0;

            System.out.println("Customer " + customer.getId());
            System.out.println("Service time: " + sleepTime + " ms");
            System.out.println("Response time: " + responseTime + " ms");
            System.out.println();

            totalServiceTime += sleepTime;
            servedCustomers++;
        }
    }

    public double getAverageServiceTime() {

        if (servedCustomers == 0) {
            return 0;
        }

        return (double) totalServiceTime / servedCustomers;
    }
}
