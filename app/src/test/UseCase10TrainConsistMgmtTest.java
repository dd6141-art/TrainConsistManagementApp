import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmtTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Running Test Case for UC10 ===");

        List<Bogie> testData = new ArrayList<>();
        testData.add(new Bogie("B1", 50));
        testData.add(new Bogie("B2", 30));
        testData.add(new Bogie("B3", 20));

        int total = testData.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        if (total == 100) {
            System.out.println("TEST PASSED: Total capacity calculation (100) is correct.");
        } else {
            System.out.println("TEST FAILED: Expected 100 but got " + total);
        }
    }
}