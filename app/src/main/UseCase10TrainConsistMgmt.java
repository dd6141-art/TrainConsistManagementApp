import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmt {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC10 Reduction ===");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", 72));
        trainConsist.add(new Bogie("AC Chair", 56));
        trainConsist.add(new Bogie("First Class", 24));
        trainConsist.add(new Bogie("General", 90));

        int totalCapacity = trainConsist.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Consist analyzed. Calculating total seats...");
        System.out.println("Total Seating Capacity of the Train: " + totalCapacity);
    }
}