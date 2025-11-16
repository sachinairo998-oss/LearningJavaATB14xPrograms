package Task.Nov16;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class AgeValidator {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }
}

public class Lab233_Custom_Exception_Implementation {
    public static void main(String[] args) {

        try {
            AgeValidator.validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }

        try {
            AgeValidator.validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}
