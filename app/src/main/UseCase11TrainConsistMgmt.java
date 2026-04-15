import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmt {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC11 Validation ===");

        // Test Inputs
        String trainIdInput = "TRN-1234";
        String cargoCodeInput = "PET-AB";

        // 1. Define Regex Patterns
        // TRN-\\d{4} matches "TRN-" followed by exactly 4 digits
        String trainIdRegex = "TRN-\\d{4}";
        // PET-[A-Z]{2} matches "PET-" followed by exactly 2 uppercase letters
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile Patterns
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // 3. Create Matchers
        Matcher trainIdMatcher = trainIdPattern.matcher(trainIdInput);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCodeInput);

        // 4. Validate and Display
        System.out.println("Checking Train ID [" + trainIdInput + "]...");
        if (trainIdMatcher.matches()) {
            System.out.println("Train ID Accepted.");
        } else {
            System.out.println("Error: Invalid Train ID format (Expected TRN-XXXX).");
        }

        System.out.println("\nChecking Cargo Code [" + cargoCodeInput + "]...");
        if (cargoCodeMatcher.matches()) {
            System.out.println("Cargo Code Accepted.");
        } else {
            System.out.println("Error: Invalid Cargo Code format (Expected PET-XX).");
        }
    }
}