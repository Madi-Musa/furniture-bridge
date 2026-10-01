package furniture.implementor;

public interface Material {
    String getName();
    String shapePart(String partName);
    String applyFinish();
    double getCostPerUnit();
}
