package FominaKat.PetAnimal;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Plate plate) {
        if ((!satiety) && (plate.getFood() >= appetite)) {
            this.satiety = true;
            return true; //кот поел
        }
        return false; //не поел
    }

    //region Getter-Setter

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite > 0) {
            this.appetite = appetite;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    //endregion

}