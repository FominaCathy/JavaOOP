package FominaKat.VendingMachine;


public class Chocolate extends Product {
    protected double cocoa;

    public Chocolate(String brand, String name, double price, double cocoa) {
        super(brand, name, price);
        this.cocoa = cocoa;
    }

    public Chocolate(String name, double price, double cocoa) {
        super(name, price);
        this.cocoa = cocoa;
    }

    //region Getter-Setter
    public double getCocoa() {
        return cocoa;
    }

    public void setCocoa(double cocoa) {
        if ((cocoa < 100)&&(cocoa >= 0)) {
            this.cocoa = cocoa;
        }
    }
    //endregion

    @Override
    public String displayInfo() {
        return String.format("Шоколад:\n\tБренд: %s\n\tНазвание: %s\n\tЦена: %.2f\n\tСодержание какао: %.2f",
                brand, name, price, cocoa);
    }


}
