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
    Ticket ticket6 = new Ticket(
            "Moscow",
            "Sochi",
            4500,
            17,
            20
    );

    @Test
    public void comparePrice() {
        int expected = -1;
        int actual = ticket2.compareTo(ticket1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchTicketsAndSortByPrice() {
        Ticket[] expected = {ticket2, ticket1};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);

        Ticket[] actual = tickets.search("Moscow", "Tagil");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void timeComparator() {
        Ticket[] expected = {ticket3, ticket1};

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] tickets = {ticket1, ticket3};
        Arrays.sort(tickets, timeComparator);
        Ticket[] actual = tickets;

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchAndSortByComparator() {
        Ticket[] expected = {ticket5, ticket6};

        AviaSouls tickets = new AviaSouls();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);

        TicketTimeComparator timeComparator = new TicketTimeComparator();

        Ticket[] actual = tickets.searchAndSortBy("Moscow", "Sochi", timeComparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}
