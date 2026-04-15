class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}

public class UseCase9ErrorHandlingValidation {

    static void validate(String roomType, int available) throws InvalidBookingException {
        if (roomType == null || roomType.isEmpty()) {
            throw new InvalidBookingException("Invalid room type");
        }
        if (available <= 0) {
            throw new InvalidBookingException("No rooms available");
        }
    }

    public static void main(String[] args) {
        try {
            validate("Single", 0);
        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
