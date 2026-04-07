package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmtTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }



    public static void main(String[] args) {
        System.out.println("=== Running Test Case for UC8 ===");

        List<Bogie> testData = new ArrayList<>();
        testData.add(new Bogie("Test1", 100));
        testData.add(new Bogie("Test2", 10));

        List<Bogie> result = testData.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        if (result.size() == 1 && result.get(0).name.equals("Test1")) {
            System.out.println("TEST PASSED: Filter logic is correct.");
        } else {
            System.out.println("TEST FAILED: Check filter conditions.");
        }
    }
}