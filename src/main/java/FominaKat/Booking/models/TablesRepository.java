package FominaKat.Booking.models;

import FominaKat.Booking.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class TablesRepository implements Model {

    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Некорректный номер столика");
    }

    /**
     * удаляет резервирование столика
     *
     * @param idReservation
     * @return true, если удалось удалить, false если удалить позицию не получилось
     */
    @Override
    public boolean cancelTable(int idReservation) {

        Reservation reservation = tables.stream().
                flatMap(table -> table.getReservations().stream())
                .filter(item -> item.getId() == idReservation)
                .findFirst().orElse(null);

        if (reservation == null) {
            throw new RuntimeException("Некорректный номер заказа");
        }

        Table table = reservation.getTable();
        table.getReservations().remove(reservation);

        return true;
    }
}
