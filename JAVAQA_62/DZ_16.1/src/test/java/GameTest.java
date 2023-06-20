import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GameTest {
    Player player1 = new Player(1, "Василий", 1);
    Player player2 = new Player(2, "Пётр", 2);
    Player player3 = new Player(3, "Харитон", 2);
    Player player4 = new Player(4, "Александр", 1);
    Player player5 = new Player(5, "Тимофей", 2);
    Player player6 = new Player(6, "Иван", 1);

    @Test
    public void createPlayerList() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);
        list.register(player3);
        list.register(player4);
        list.register(player5);
        list.register(player6);
        Player[] expected = {player1, player2, player3, player4, player5, player6};
        Player[] actual = list.players();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void playerGetID() {// Сравнение id игрока в тесте и в списке, что-бы покрыть бенч на 100%, и не удалять геттер из класса игроков
        Game list = new Game();
        list.register(player1);
        list.register(player2);

        int expected = player1.getId();
        int actual = list.searchPlayer(player1.getName()).getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void roundWinFirst() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);
        list.register(player3);
        list.register(player4);
        list.register(player5);
        list.register(player6);

        int expected = 1;
        int actual = list.round(player5.getName(), player6.getName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void roundWinSecond() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);
        list.register(player3);
        list.register(player4);
        list.register(player5);
        list.register(player6);

        int expected = 2;
        int actual = list.round(player4.getName(), player2.getName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void roundWinFriendship() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);
        list.register(player3);
        list.register(player4);
        list.register(player5);
        list.register(player6);

        int expected = 0;
        int actual = list.round(player2.getName(), player5.getName());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void roundPlayer1NotRegister() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            list.round(player6.getName(), player1.getName());
        });
    }

    @Test
    public void roundPlayer2NotRegister() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            list.round(player1.getName(), player6.getName());
        });
    }

    @Test
    public void roundPlayersNotRegister() {
        Game list = new Game();
        list.register(player1);
        list.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            list.round(player3.getName(), player4.getName());
        });
    }
}
