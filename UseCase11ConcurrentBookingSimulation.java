import java.util.*;

class SafeBooking {
    private int rooms = 1;

    public synchronized void book(String user) {
        if (rooms > 0) {
            System.out.println(user + " booked room");
            rooms--;
        } else {
            System.out.println(user + " failed - no rooms");
        }
    }
}

public class UseCase11ConcurrentBookingSimulation {
    public static void main(String[] args) {

        SafeBooking booking = new SafeBooking();

        Thread t1 = new Thread(() -> booking.book("User1"));
        Thread t2 = new Thread(() -> booking.book("User2"));

        t1.start();
        t2.start();
    }
}
