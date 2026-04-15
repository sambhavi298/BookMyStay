import java.util.*;

class ReservationHistory {
    String id;
    String type;

    public ReservationHistory(String id, String type) {
        this.id = id;
        this.type = type;
    }
}

public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {

        List<ReservationHistory> history = new ArrayList<>();

        history.add(new ReservationHistory("R1", "Single"));
        history.add(new ReservationHistory("R2", "Suite"));

        System.out.println("Booking History:");

        for (ReservationHistory r : history) {
            System.out.println(r.id + " -> " + r.type);
        }
    }
}
