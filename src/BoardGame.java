/**  *
 * @author : Harshitha
 * @version : 1.0
 * @date : 09/26/2022
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardGame {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);

        System.out.println("***********************Welcome to Online Board Games***************************************");
        System.out.println("Please choose the game you want to play from the menu below  \n 1. TIC TAC TOE (that to go game always to play) \n 2. ORDER & CHAOS ");
        switch (Integer.parseInt(input.readLine())) {
            case 1 -> new TicTacToe().startGame();
            case 2 -> new OrderAndChaos().startGame();
            default -> System.out.println("Invalid Choice!! Please run the program again!");
        }
    }
}
