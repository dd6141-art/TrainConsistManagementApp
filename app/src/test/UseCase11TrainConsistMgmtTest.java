import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmtTest {

    public static void main(String[] args) {
        System.out.println("=== Running Test Case for UC11 ===");

        String validTrainId = "TRN-9999";
        String invalidTrainId = "TRN-ABC";
        String regex = "TRN-\\d{4}";

        boolean test1 = Pattern.compile(regex).matcher(validTrainId).matches();
        boolean test2 = Pattern.compile(regex).matcher(invalidTrainId).matches();

        if (test1 && !test2) {
            System.out.println("TEST PASSED: Regex validation logic is correct.");
        } else {
            System.out.println("TEST FAILED: Validation logic returned unexpected results.");
        }
    }
}