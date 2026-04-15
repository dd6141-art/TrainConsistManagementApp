import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    static class Bogie {
        String name;
        String type; // Added type for grouping (e.g., Passenger, Freight)

        Bogie(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC9 Grouping ===");

        List<Bogie> trainConsist = new ArrayList<>();
        trainConsist.add(new Bogie("Sleeper", "Passenger"));
        trainConsist.add(new Bogie("AC Chair", "Passenger"));
        trainConsist.add(new Bogie("Coal Wagon", "Freight"));
        trainConsist.add(new Bogie("Oil Tanker", "Freight"));
        trainConsist.add(new Bogie("First Class", "Passenger"));

        Map<String, List<Bogie>> groupedBogies = trainConsist.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("Bogies grouped by type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });
    }
}