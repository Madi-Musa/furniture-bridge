package furniture.abstraction;
import furniture.implementor.Material;
import java.util.Objects;

public abstract class Furniture {
    protected Material material;
    protected Furniture(Material material) {
        this.material = Objects.requireNonNull(material, "material must not be null");
    }
    public void setMaterial(Material material) {
        this.material = Objects.requireNonNull(material, "material must not be null");
    }
    public Material getMaterial() {
        return material;
    }
    public abstract String getName();
    public abstract void build();
    public abstract double getPrice();
    public void showInfo() {
        System.out.printf("%s made of %s - price: $%.2f%n",
                getName(), material.getName(), getPrice());
    }
}
