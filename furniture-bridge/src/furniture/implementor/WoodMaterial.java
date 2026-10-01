package furniture.implementor;

public class WoodMaterial implements Material {
    private static final double COST_PER_UNIT = 25.0;

    @Override
    public String getName() {
        return "Wood";
    }
    @Override
    public String shapePart(String partName) {
        return "Sawing and carving " + partName + " from solid oak";
    }
    @Override
    public String applyFinish() {
        return "Sanding and covering with natural varnish";
    }
    @Override
    public double getCostPerUnit() {
        return COST_PER_UNIT;
    }
}
