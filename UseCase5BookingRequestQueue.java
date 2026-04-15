import java.util.LinkedList;
import java.util.Queue;

class Reservation {
    String name;
    String roomType;

    public Reservation(String name, String roomType) {
        this.name = name;
        this.roomType = roomType;
    }
}

public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {

        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("A", "Single"));
        queue.add(new Reservation("B", "Suite"));
        queue.add(new Reservation("C", "Double"));

        System.out.println("Booking Requests in Queue:");

        for (Reservation r : queue) {
            System.out.println(r.name + " requested " + r.roomType);
        }
    }
}
