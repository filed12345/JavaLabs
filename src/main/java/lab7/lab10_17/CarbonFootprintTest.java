package lab7.lab10_17;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> footprintItems = new ArrayList<CarbonFootprint>();
        double totalFootprint = 0;
        footprintItems.add(new Building(100, 2, 100, "Rich's House", 100, 100,
                100, 100, 0));
        footprintItems.add(new Car("Rich's Mini Cooper S", 10000, 25));
        footprintItems.add(new Bicycle("Rich's Bicycle", 1000,
                Bicycle.PowerSource.CHEESEBURGERS));
        for (CarbonFootprint item : footprintItems){
            double footprint = item.getCarbonFootprint();
            totalFootprint += footprint;
            System.out.println("\nItem: " + item.toString());
            System.out.println("\tCarbon footprint:" + footprint);
        }
        System.out.println("\nTotal carbon footprint for this session:" +totalFootprint);
    }
}
