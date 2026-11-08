
package orientationtask1_2;

public class OrientationTask2_3 {

    public static void main(String[] args) {

        EventList eventList = new EventList();

        eventList.addEvent(new Event(12, EventType.EXIT));
        eventList.addEvent(new Event(5, EventType.ARRIVAL));
        eventList.addEvent(new Event(9, EventType.EXIT));
        eventList.addEvent(new Event(3, EventType.ARRIVAL));

        System.out.println("Events in time order:");
        eventList.printEvents();
    }
}
