package FominaKat.BoxFruits;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    /**
     * сравнивает коробки по весу вне зависимости от фрукта в ней
     *
     * @param box
     * @return true – если их массы равны, false в противоположном случае.
     */
    public boolean compare(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    /**
     * добавить сразу несколько единиц
     *
     * @param fruit какой фрукт добавляем
     * @param count кол-во
     */
    public void addFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            addFruit(fruit);
        }
    }

    public T popFruit() {
        if (this.fruits.isEmpty()) {
            return null;
        } else {
            int lastIndex = this.fruits.size() - 1;
            return this.fruits.remove(lastIndex);
        }
    }

    public float getWeight() {
        if (this.fruits.isEmpty()) {
            return 0.0f;
        }
        return this.fruits.size() * this.fruits.get(0).weight;
    }

    /**
     * метод пересыпает фрукты из текущей коробки в коробку, переданную как аргумент.
     *
     * @param box = коробка в которую пересыпают
     */
    public void moveTo(Box<T> box) {
        while (!this.fruits.isEmpty()) {
            box.addFruit(this.popFruit());
        }
    }
}
