package FominaKat.VendingMachine;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Chocolate getChocolate(String name, double cocoa) {
        Product res = products.stream()
                .filter(product -> product instanceof Chocolate)
                .filter(product -> product.name.equals(name))
                .filter(product -> ((Chocolate) product).cocoa == cocoa)
                .findFirst()
                .orElse(null);

        return (Chocolate) res;
    }


}
