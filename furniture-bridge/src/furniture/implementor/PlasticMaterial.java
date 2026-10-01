package furniture.implementor;

public class PlasticMaterial implements Material {
    private static final double COST_PER_UNIT = 10.0;

    @Override
    public String getName() {
        return "Plastic";
    }
    @Override
    public String shapePart(String partName) {
        return "Injection-molding " + partName + " from recycled plastic";
    }
    @Override
    public String applyFinish() {
        return "Polishing the surface and trimming the edges";
    }
    @Override
    public double getCostPerUnit() {
        return COST_PER_UNIT;
    }
}
