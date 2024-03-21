package FominaKat.Booking.presenters;



import FominaKat.Booking.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * отменить бронь по номеру
     * @param idReservation
     * @return
     */
    boolean cancelTable(int idReservation);
}
