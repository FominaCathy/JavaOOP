package FominaKat.VendingMachine.sample;


import FominaKat.VendingMachine.Product;

public class Program {

    public static void main(String[] args) {
        Product product1 = new Product("Brand #1", " ", -1000 );
        Product product2 = new Product("Name #2", 350);
        System.out.println(product1.displayInfo());
        System.out.println(product2.displayInfo());

    }

}
