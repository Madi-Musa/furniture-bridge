package furniture;

import furniture.abstraction.Chair;
import furniture.abstraction.Furniture;
import furniture.abstraction.Table;
import furniture.abstraction.Wardrobe;
import furniture.implementor.MetalMaterial;
import furniture.implementor.PlasticMaterial;
import furniture.implementor.WoodMaterial;

public class Main {

    public static void main(String[] args) {
        System.out.println("Part 1: compose at runtime");

        Furniture chair = new Chair(new WoodMaterial());
        chair.build();
        chair.showInfo();

        System.out.println();
        System.out.println("Part 2: switch the implementation of the SAME object");

        chair.setMaterial(new MetalMaterial());
        chair.build();
        chair.showInfo();

        chair.setMaterial(new PlasticMaterial());
        chair.build();
        chair.showInfo();

        System.out.println();
        System.out.println("Part 3: other abstractions with other implementations");

        Furniture table = new Table(new MetalMaterial());
        table.build();
        table.showInfo();

        System.out.println();

        Furniture wardrobe = new Wardrobe(new WoodMaterial());
        wardrobe.build();
        wardrobe.showInfo();
    }
}