
package orientationtask1_2;

public class OrientationTask2_2 {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(12));
        eventList.addEvent(new Event(5));
        eventList.addEvent(new Event(9));
        eventList.addEvent(new Event(3));

        System.out.println("Next event:");
        System.out.println(eventList.getNextEvent());

        System.out.println("\nRemaining events in order:");
        eventList.printEvents();
    }
}
