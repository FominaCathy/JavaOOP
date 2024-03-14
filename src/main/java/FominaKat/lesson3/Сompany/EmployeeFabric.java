package FominaKat.lesson3.Сompany;

import java.time.LocalDate;
import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();
    private static String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    private static String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
    private static int minSalary = 60000;
    private static int maxSalary = 120000;

    private static LocalDate start = LocalDate.now().minusYears(55);


    public static Worker generateWorker() {
        return Worker.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                start.plusDays(random.nextInt(10 * 365)),
                random.nextInt(minSalary, maxSalary + 1));
    }

    public static Freelancer generateFreelancer() {
        return Freelancer.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                start.plusDays(random.nextInt(35 * 365)),
                random.nextInt(minSalary, maxSalary + 1) / (20.8 * 8));
    }

    public static Volonter generateVolonter() {
        return Volonter.create(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                start.plusDays(random.nextInt(35 * 365)));
    }


    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     *
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {

            int rndChoice = random.nextInt(3);
            switch (rndChoice) {
                case 0 -> employees[i] = generateWorker();
                case 1 -> employees[i] = generateFreelancer();
                case 2 -> employees[i] = generateVolonter();
            }
        }
        return employees;
    }

}
