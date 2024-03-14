package FominaKat.lesson3.Company;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] workers = EmployeeFabric.generateEmployees(15);
        System.out.println("\n--- исходный список----\n");
        Arrays.stream(workers).forEach(System.out::println);

        System.out.println("\n---сортируем по имени и если именя одинаковые - по дате рождения---\n");
        Arrays.sort(workers, new NameAgeComparator());
        Arrays.stream(workers).forEach(System.out::println);

        System.out.println("\n---сортируем по возрасту (годам)  и если возраст одинаковый - по имени---\n");
        Arrays.sort(workers, new AgeComparator());
        Arrays.stream(workers).forEach(System.out::println);


    }


}
