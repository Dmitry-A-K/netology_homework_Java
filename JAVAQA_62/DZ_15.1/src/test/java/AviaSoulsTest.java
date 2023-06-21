import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AviaSoulsTest {
    Ticket ticket1 = new Ticket(
            "Moscow",
            "Tagil",
            3000,
            13,
            15
    );
    Ticket ticket2 = new Ticket(
            "Moscow",
            "Tagil",
            2000,
            21,
            23
    );
    Ticket ticket3 = new Ticket(
            "Moscow",
            "SPb",
            2500,
            11,
            12
    );
    Ticket ticket4 = new Ticket(
            "Moscow",
            "SPb",
            2000,
            22,
            23
    );
    Ticket ticket5 = new Ticket(
            "Moscow",
            "Sochi",
            5000,
            9,
            12
    );

    @Test
    public void comparePrice() {
        int expected = -1;
        int actual = ticket2.compareTo(ticket1);

        Assertions.assertEquals(expected, actual);
    }    // Сравнение цены двух билетов

    @Test
    public void compareTime() {
        Ticket[] expected = {ticket3, ticket1};

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket3};
        Arrays.sort(tickets, timeComparator);
        Ticket[] actual = tickets;

        Assertions.assertArrayEquals(expected, actual);
    }   // Сравнение билетов по времени вылета

    @Test
    public void searchNullTicket() {
        Ticket[] expected = {};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        Ticket[] actual = tickets.search("Moscow", "Vladivostok");

        Assertions.assertArrayEquals(expected, actual);
    }   // Отсутствие билетов при поиске по цене

    @Test
    public void searchNullTicketByComparator() {
        Ticket[] expected = {};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] actual = tickets.searchAndSortByTime("Moscow", "Vladivostok", timeComparator);

        Assertions.assertArrayEquals(expected, actual);
    }   // Отсутствие билетов при поиске по времени

    @Test
    public void searchOneTicket() {
        Ticket[] expected = {ticket5};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        Ticket[] actual = tickets.search("Moscow", "Sochi");

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение одного билета при поиске по цене

    @Test
    public void searchOneTicketByComparator() {
        Ticket[] expected = {ticket5};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] actual = tickets.searchAndSortByTime("Moscow", "Sochi", timeComparator);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение одного билета при поиске по времени

    @Test
    public void searchTicketsAndSortByPrice() {
        Ticket[] expected = {ticket2, ticket1};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        Ticket[] actual = tickets.search("Moscow", "Tagil");

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение нескольких билетов при поиске по цене

    @Test
    public void searchTicketsAndSortByComparator() {
        Ticket[] expected = {ticket3, ticket4};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] actual = tickets.searchAndSortByTime("Moscow", "SPb", timeComparator);

        Assertions.assertArrayEquals(expected, actual);
    }   // Нахождение нескольких билетов при поиске по времени

}
