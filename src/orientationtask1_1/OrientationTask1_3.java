
package orientationtask1_1;

public class OrientationTask1_3 {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setStartTime(1000);
        customer1.setEndTime(4000);

        Customer customer2 = new Customer();
        customer2.setStartTime(2000);
        customer2.setEndTime(7000);

        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Time spent: " + customer1.getTimeSpent());

        System.out.println("Customer ID: " + customer2.getId());
        System.out.println("Time spent: " + customer2.getTimeSpent());
    }
}
