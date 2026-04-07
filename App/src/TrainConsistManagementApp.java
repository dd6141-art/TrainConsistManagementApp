import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies added: " + trainConsist);
        System.out.println("Current count: " + trainConsist.size());

        trainConsist.remove("AC Chair");
        System.out.println("After removing AC Chair: " + trainConsist);

        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is not found.");
        }

        System.out.println("Final train consist: " + trainConsist);
    }
}