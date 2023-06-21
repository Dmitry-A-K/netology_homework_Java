import java.util.Objects;

public class Game {
    private Player[] list = new Player[0];

    public Player[] players() {
        return list;
    }

    public void register(Player player) {
        Player[] players = new Player[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            players[i] = list[i];
        }
        players[players.length - 1] = player;
        list = players;
    }

    public Player searchPlayer(String playerName) {
        for (Player player : list) {
            if (Objects.equals(player.getName(), playerName)) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        int result;
        Player player1 = searchPlayer(playerName1);
        Player player2 = searchPlayer(playerName2);
        if (player1 == null) throw new NotRegisteredException("Player with name: " + playerName1 + " not register");
        if (player2 == null) throw new NotRegisteredException("Player with id: " + playerName2 + " not register");

        if (player1.getStrength() > player2.getStrength()) {
            result = 1;
        } else if (player1.getStrength() < player2.getStrength()) {
            result = 2;
        } else {
            result = 0;
        }

        return result;
    }
}
