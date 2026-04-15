import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmt {

    static class GoodsBogie {
        String name;
        String type;
        String cargo;

        GoodsBogie(String name, String type, String cargo) {
            this.name = name;
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App: UC12 Safety Rules ===");

        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("G1", "Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("G2", "Box", "Coal"));
        goodsConsist.add(new GoodsBogie("G3", "Cylindrical", "Petroleum"));

        // Rule: If type is Cylindrical, cargo MUST be Petroleum
        boolean isSafe = goodsConsist.stream().allMatch(bogie -> {
            if (bogie.type.equals("Cylindrical")) {
                return bogie.cargo.equals("Petroleum");
            }
            return true;
        });

        System.out.println("Validating train safety protocols...");
        if (isSafe) {
            System.out.println("RESULT: Train is Safety Compliant.");
        } else {
            System.out.println("RESULT: SAFETY BREACH! Invalid cargo detected.");
        }
    }
}