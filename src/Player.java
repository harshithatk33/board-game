/**
 * Player class comprises of different properities that each player can hold
 *
 * @author : Harshitha T K
 * @version : 1.0
 * @date : 09/26/2022
 */

public class Player {
    private String playerName;
    private String playerAttribute;

    Player(String playerName, String playerAttribute) {
        this.setPlayerName(playerName);
        this.setPlayerAttribute(playerAttribute);
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerAttribute() {
        return this.playerAttribute;
    }

    public void setPlayerAttribute(String playerAttribute) {
        if (!(playerAttribute.equals("X") || playerAttribute.equals("O") || playerAttribute.equals("Order") || playerAttribute.equals("Chaos"))) {
            System.out.println("Error: Player type invalid. Game Crashed $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ Thank you :) Start again from first");
        }
        this.playerAttribute = playerAttribute;
    }


}
