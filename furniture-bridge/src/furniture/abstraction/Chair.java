package furniture.abstraction;
import furniture.implementor.Material;

public class Chair extends Furniture {
    private static final int MATERIAL_UNITS = 2;
    private static final double LABOUR_COST = 15.0;

    public Chair(Material material) {
        super(material);
    }

    @Override
    public String getName() {
        return "Chair";
    }
    @Override
    public void build() {
        System.out.println("Building a chair:");
        System.out.println("  1. " + material.shapePart("4 legs"));
        System.out.println("  2. " + material.shapePart("the seat"));
        System.out.println("  3. " + material.shapePart("the backrest"));
        System.out.println("  4. " + material.applyFinish());
    }
    @Override
    public double getPrice() {
        return MATERIAL_UNITS * material.getCostPerUnit() + LABOUR_COST;
    }
}
