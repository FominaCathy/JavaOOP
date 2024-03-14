package FominaKat.lesson3.Сompany;

import java.util.Comparator;

/**
 * дополнительно сортирую по дате рождения, ели имя и фамилия одинаковые
 */
public class NameAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.compareTo(o2) == 0) {
            return o2.birthDay.compareTo(o1.birthDay);
        }
        return o1.compareTo(o2);
    }
}
