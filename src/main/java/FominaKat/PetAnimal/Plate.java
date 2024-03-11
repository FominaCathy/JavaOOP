package FominaKat.PetAnimal;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    /**
     * метод для добавления еды в тарелку
     *
     * @param food
     */
    public void addFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public void info() {
        System.out.println("rest in plate: " + food);
    }

    //region Getter-Setter

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food >= 0) {
            this.food = food;
        }

    }
    //endregion
}
