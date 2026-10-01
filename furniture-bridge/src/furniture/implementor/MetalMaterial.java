package furniture.implementor;

public class MetalMaterial implements Material {
    private static final double COST_PER_UNIT = 35.0;

    @Override
    public String getName() {
        return "Metal";
    }
    @Override
    public String shapePart(String partName) {
        return "Cutting and welding " + partName + " from steel tubes";
    }
    @Override
    public String applyFinish() {
        return "Grinding and powder-coating against rust";
    }
    @Override
    public double getCostPerUnit() {
        return COST_PER_UNIT;
    }
}
