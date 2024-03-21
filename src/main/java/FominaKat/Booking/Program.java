package FominaKat.Booking;

import FominaKat.Booking.models.Reservation;
import FominaKat.Booking.models.Table;
import FominaKat.Booking.models.TablesRepository;
import FominaKat.Booking.presenters.BookingPresenter;
import FominaKat.Booking.views.BookingView;

import java.util.Date;

public class Program {


    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TablesRepository tablesRepository = new TablesRepository();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tablesRepository, bookingView);
        bookingPresenter.updateTablesView();
        bookingView.reservationTable(new Date(), 2, "Станислав");
        bookingView.reservationTable(new Date(), 2, "Тоня");
        bookingView.reservationTable(new Date(), 3, "Ваня");

        printReserved(tablesRepository);

        bookingView.changeReservationTable(1001, new Date(), 4, "Станислав");
        System.out.println("-----");
        printReserved(tablesRepository);
    }

    private static void printReserved(TablesRepository tablesRepository) {
        for (Table table : tablesRepository.loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                System.out.printf("бронь № %d: столик № %d - %s\n",
                        reservation.getId(),
                        reservation.getTable().getNo(),
                        reservation.getName());
            }
        }
    }

}
