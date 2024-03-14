package FominaKat.lesson3.Company;

import java.util.Comparator;

/**
 * сортировка по возрасту. если возраст одинаковый - сортирую по имени и фамилии
 */
public class AgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (Integer.compare(o1.getAge(), o2.getAge()) == 0) {
            return o1.compareTo(o2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
