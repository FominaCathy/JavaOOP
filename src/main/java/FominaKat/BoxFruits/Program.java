package FominaKat.BoxFruits;

public class Program {

    /**
     * Домашняя работа, задача:
     * ========================
     * <p>
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        //фрукты:
        Apple apple = new Apple();
        Orange orange = new Orange();

        //коробки для фруктов:
        Box<Apple> appleBoxFirst = new Box<>();
        Box<Apple> appleBoxSecond = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        //наполняем:
        appleBoxSecond.addFruit(apple, 15);
        appleBoxFirst.addFruit(apple, 5);
        orangeBox.addFruit(orange, 10);
        System.out.println("вес коробок:");
        System.out.printf("вес appleBoxSecond = %.2f\n", appleBoxSecond.getWeight());
        System.out.printf("вес appleBoxFirst = %.2f\n", appleBoxFirst.getWeight());
        System.out.printf("вес orangeBox = %.2f\n", orangeBox.getWeight());

        System.out.println("\nсравним коробки:");
        System.out.printf("%s = %s ?: %b\n","orangeBox", "appleBoxSecond",  orangeBox.compare(appleBoxSecond));
        System.out.printf("%s = %s ?: %b\n","appleBoxSecond", "appleBoxFirst", appleBoxSecond.compare(appleBoxFirst));

        System.out.println("\nперевыпем:");
        appleBoxFirst.moveTo(appleBoxSecond);
        System.out.printf("вес appleBoxFirst = %.2f\n", appleBoxFirst.getWeight());
        System.out.printf("вес appleBoxSecond = %.2f\n", appleBoxSecond.getWeight());

    }

}
