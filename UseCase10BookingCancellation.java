import java.util.*;

public class UseCase10BookingCancellation {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Map<String, Integer> inventory = new HashMap<>();

        inventory.put("Single", 1);

        // simulate allocation
        stack.push("Single_101");
        inventory.put("Single", 0);

        // cancellation
        if (!stack.isEmpty()) {
            String released = stack.pop();
            inventory.put("Single", inventory.get("Single") + 1);
            System.out.println("Cancelled: " + released);
        }

        System.out.println("Updated Inventory: " + inventory.get("Single"));
    }
}
