package FominaKat.Booking.presenters;

import FominaKat.Booking.models.Table;

import java.util.Collection;

public interface View {

    void showTables(Collection<Table> tables);

    void showReservationTableResult(int reservationNo);

    void registerObserver(ViewObserver observer);


}
