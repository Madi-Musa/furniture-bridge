package furniture.abstraction;
import furniture.implementor.Material;

public class Table extends Furniture {
    private static final int MATERIAL_UNITS = 5;
    private static final double LABOUR_COST = 25.0;

    public Table(Material material) {
        super(material);
    }
    @Override
    public String getName() {
        return "Table";
    }

    @Override
    public void build() {
        System.out.println("Building a table:");
        System.out.println("  1. " + material.shapePart("4 legs"));
        System.out.println("  2. " + material.shapePart("the tabletop"));
        System.out.println("  3. " + material.applyFinish());
    }
    @Override
    public double getPrice() {
        return MATERIAL_UNITS * material.getCostPerUnit() + LABOUR_COST;
    }
}
