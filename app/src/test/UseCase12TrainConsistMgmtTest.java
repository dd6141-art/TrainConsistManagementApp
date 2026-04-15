import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmtTest {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Running Test Case for UC12 ===");

        List<GoodsBogie> unsafeData = new ArrayList<>();
        unsafeData.add(new GoodsBogie("Cylindrical", "Water")); // Should fail

        boolean isSafe = unsafeData.stream().allMatch(b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
        );

        if (!isSafe) {
            System.out.println("TEST PASSED: System correctly identified unsafe cargo.");
        } else {
            System.out.println("TEST FAILED: System missed a safety violation.");
        }
    }
}