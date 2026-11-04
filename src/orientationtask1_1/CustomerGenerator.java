
package orientationtask1_1;

public class CustomerGenerator {

    public void generateCustomers(int number, ServicePoint servicePoint) {

        for (int i = 0; i < number; i++) {

            Customer customer = new Customer();
            servicePoint.addToQueueue(customer);
        }
    }
}
