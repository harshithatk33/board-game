/**
 * Tic tac toe class has all components to check the game, players, pawns, moves and announce winner in the game TIC TAC TOE
 *
 * @author : Harshitha
 * @version : 1.0
 * @date : 09/26/2022
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {

    public void startGame() throws IOException {


        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        Integer rowIndex = null;
        Integer columnIndex = null;
        Player[] players = new Player[2];
        Pawn[] pawns = new Pawn[2];
        Board obj = null;


        System.out.println("****************************************************************************************");
        System.out.println("                    Thank you for opting to play Tic-Tac-Toe");
        System.out.println("****************************************************************************************");
        System.out.println("The default size of the board is 3 X 3, If you wish to play with the customized size \n Please enter Y else enter N");
        String option = input.readLine();


        if (option.equalsIgnoreCase("Y")) {
            for (int i = 0; i < 3; i++) {
                System.out.print(("Enter the root password to proceed to dimension customization :"));
                String read = input.readLine();
                System.out.println(read);
                if (read.equals("Root123")) {
                    System.out.println("you have successfully logged in as Admin");
                    System.out.println("Please Enter the new dimension for the board");
                    Integer newDimension = Integer.parseInt(input.readLine());
                    obj = new Board(newDimension, newDimension);
                    obj.createBoard();
                    break;
                } else {
                    System.out.println("Oops you have failed to login as Admin \n Totally only 3 chances are provided, where you have missed this one!!");
                }
            }
        } else {
            System.out.print("The game is taking the default size 3 X 3");
            obj = new Board(3, 3);
            obj.createBoard();
        }

        System.out.print("Enter the name of Player1 :");   /* first player input */
        String player1 = input.readLine();
        System.out.println("Please Enter your preferred pawn type. X and O are the only available pawn types");
        String player1Preference = Character.toString((char) input.read()).toUpperCase();
        input.readLine();
        players[0] = new Player(player1, player1Preference);
        pawns[0] = new Pawn("White", players[0].getPlayerAttribute());

        System.out.println("Enter the name of Player2 :");   /* Second player input */
        String player2 = input.readLine();
        players[1] = new Player(player2, players[0].getPlayerAttribute().equals("X") ? "O" : "X");
        pawns[1] = new Pawn("Black", players[1].getPlayerAttribute());

        obj.displayBoard();

        int numOfMoves;

        System.out.println("Game starts in\n 3 \n 2 \n 1");

        loop:
        for (numOfMoves = 0; numOfMoves <= (obj.getColumn() * obj.getRow()); ) {
            for (int numOfPlayer = 0; numOfPlayer < 2; ) {
                System.out.println("Move" + (numOfMoves + 1));
                System.out.println(" " + (players[numOfPlayer].getPlayerName()) + " please make your move: ");
                int position = Integer.parseInt(input.readLine()) - 1;

                if (position >= 0 && position <= (obj.getColumn() * obj.getRow())) {
                    int indexI = position / obj.getRow();
                    int indexJ = (int) Math.round(((1.0 * position / obj.getRow()) - indexI) * obj.getRow());

                    try {
                        Rules.makeMove(obj, pawns[numOfPlayer], indexI, indexJ);
                        obj.displayBoard();
                        System.out.println("Move successfully placed");
                        numOfMoves++;
                        if ((numOfMoves >= ((obj.getRow() * 2) - 1)) && Rules.resolveGame(obj, indexI, indexJ)) {
                            System.out.println("Winner available and the winner is " + players[numOfPlayer].getPlayerName());
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
            System.out.println("Its a tie! :)");
        }
    }
}

