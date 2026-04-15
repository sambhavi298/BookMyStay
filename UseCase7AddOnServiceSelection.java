import java.util.*;

class Service {
    String name;
    double cost;

    public Service(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
}

public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {

        Map<String, List<Service>> addOns = new HashMap<>();

        String reservationId = "R1";

        List<Service> services = new ArrayList<>();
        services.add(new Service("Breakfast", 200));
        services.add(new Service("WiFi", 100));

        addOns.put(reservationId, services);

        double total = 0;
        for (Service s : addOns.get(reservationId)) {
            total += s.cost;
        }

        System.out.println("Total Add-on Cost: ₹" + total);
    }
}
