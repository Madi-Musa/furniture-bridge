package furniture.abstraction;
import furniture.implementor.Material;

public class Wardrobe extends Furniture {
    private static final int MATERIAL_UNITS = 12;
    private static final double LABOUR_COST = 60.0;

    public Wardrobe(Material material) {
        super(material);
    }

    @Override
    public String getName() {
        return "Wardrobe";
    }
    @Override
    public void build() {
        System.out.println("Building a wardrobe:");
        System.out.println("  1. " + material.shapePart("the frame"));
        System.out.println("  2. " + material.shapePart("2 doors"));
        System.out.println("  3. " + material.shapePart("3 inner shelves"));
        System.out.println("  4. " + material.applyFinish());
    }
    @Override
    public double getPrice() {
        return MATERIAL_UNITS * material.getCostPerUnit() + LABOUR_COST;
    }
}
