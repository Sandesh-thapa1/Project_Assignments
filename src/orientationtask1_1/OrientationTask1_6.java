
package orientationtask1_1;

public class OrientationTask1_6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            System.out.println("Simulation " + i);

            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator();

            generator.generateCustomers(5, servicePoint);

            servicePoint.serve();

            System.out.println("Average service time: "
                    + servicePoint.getAverageServiceTime() + " ms");

            System.out.println("----------------------");
        }
    }
}
