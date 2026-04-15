import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmtTest {

    static class Bogie {
        String name;
        String type;

        Bogie(String name, String type) {
            this.name = name;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Running Test Case for UC9 ===");

        List<Bogie> testData = new ArrayList<>();
        testData.add(new Bogie("B1", "A"));
        testData.add(new Bogie("B2", "A"));
        testData.add(new Bogie("B3", "B"));

        Map<String, List<Bogie>> result = testData.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        boolean isCorrect = result.get("A").size() == 2 && result.get("B").size() == 1;

        if (isCorrect) {
            System.out.println("TEST PASSED: Grouping logic is accurate.");
        } else {
            System.out.println("TEST FAILED: Groups do not match expected sizes.");
        }
    }
}