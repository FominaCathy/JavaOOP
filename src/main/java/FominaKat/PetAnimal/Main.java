package FominaKat.PetAnimal;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> pets = new ArrayList<>();
        pets.add(new Cat("Barsik", 5));
        pets.add(new Cat("Kuzya", 15));
        pets.add(new Cat("Murka", 20));
        pets.add(new Cat("Dasha", 10));

        Plate plate = new Plate(40); //специально меньше чем нужно

        Collections.shuffle(pets); //перемешаем их
        System.out.println("---кормежка----");
        feeding(pets, plate); //покормим

        plate.info();
        pets.forEach(cat -> System.out.println(cat.getName() + ": сытость = " + cat.isSatiety()));

        plate.addFood(10); //добавим еды
        System.out.println("---кормежка----");
        plate.info();
        Collections.shuffle(pets); //перемешаем их

        feeding(pets, plate); //покормим

//        pets.forEach(cat -> cat.setSatiety(false)); //сделаем кошек голодными

    }

    private static void feeding(ArrayList<Cat> pets, Plate plate) {
        pets.forEach(cat -> {
            if (cat.isSatiety()) {
                System.out.printf("%s сыт\n", cat.getName());
            } else if (cat.eat(plate)) { //если кот поел, то мы уменьшаем кол-во еды в тарелке
                System.out.printf("%s съел %d из доступных в тарелке %d\n", cat.getName(), cat.getAppetite(), plate.getFood());
                plate.setFood(plate.getFood() - cat.getAppetite());
            } else {
                System.out.printf("%s недостаточно %d из доступных в тарелке %d\n", cat.getName(), cat.getAppetite(), plate.getFood());
            }
        });


    }


}
