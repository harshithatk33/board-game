/**
        * @author : Harshitha
        * @version : 1.0
        * @date : 09/26/2022
        */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class OrderAndChaos {
    public void startGame() throws IOException {

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        Board obj = new Board(6, 6);
        obj.createBoard();
        //obj.displayBoard();

        System.out.println("****************************************************************************************");
        System.out.println("                    Thank you for opting to play Order and Chaos");
        System.out.println("****************************************************************************************");
        System.out.println("The default size of the board is 6 X 6");
//        String option = input.readLine();

        System.out.println("Order and Chaos is a game played with X and O pawns, which can be chosen by any player for their each move. \n Hope you have good game");

        Player[] playerList = new Player[2];
        HashMap<String, Pawn> pawnHashMap = new HashMap<>();

        System.out.println("Please Enter the name of the player playing as ORDER");
        playerList[0] = new Player(input.readLine(), "Order");
        pawnHashMap.put("X", new Pawn("Yellow", "X"));

        System.out.println("Please Enter the name of the player playing as Chaos");
        playerList[1] = new Player(input.readLine(), "Chaos");
        pawnHashMap.put("O", new Pawn("Blue", "O"));

        System.out.println(" Moves are placed once the player provides the position");
        int numOfMoves;

        loop:
        for (numOfMoves = 0; numOfMoves <= (obj.getColumn() * obj.getRow()); ) {
            for (int numOfPlayer = 0; numOfPlayer < 2; ) {
                System.out.println("Move" + (numOfMoves + 1));
                System.out.println("\n It is the turn of " + (numOfPlayer == 0 ? "Order" : "Chaos"));
                System.out.println(" " + (playerList[numOfPlayer].getPlayerName()) + " Which pawn do you want to choose: ");
                String selectedPiece = Character.toString(input.read()).toUpperCase();
                input.readLine();
                if (!selectedPiece.equals("X") && !selectedPiece.equals("O")) {
                    System.out.println("Invalid Entry");
                    continue;
                }
                System.out.println(" Please go ahead and Enter your move");
                int position = Integer.parseInt(input.readLine()) - 1;

                if (position >= 0 && position <= (obj.getColumn() * obj.getRow())) {
                    int indexI = position / obj.getRow();
                    int indexJ = (int) Math.round(((1.0 * position / obj.getRow()) - indexI) * obj.getRow());

                    try {
                        Rules.makeMove(obj, pawnHashMap.get(selectedPiece), indexI, indexJ);
                        obj.displayBoard();
                        System.out.println("Move successfully placed");
                        numOfMoves++;
                        if ((numOfMoves >= 5) && Rules.resolveGame(obj, indexI, indexJ)) {
                            System.out.println("Winner available and the winner is Order and the player is " + playerList[0].getPlayerName());
                            break loop;
                        }
                        numOfPlayer++;
                    } catch (Exception e) {
                        System.out.println("Exception of move : Position selected where already pawns are present \n" + e);
                    }

                } else {
                    System.out.println("Invalid entry for the position! Please try again");
                }
            }
        }
        if (numOfMoves == (obj.getColumn() * obj.getRow())) {
            System.out.println("The winner is Chaos and the player is " + playerList[1].getPlayerName());
        }


    }
}
