# CS611-One
## Tic Tac Toe and other variants
---------------------------------------------------------------------------
Harshitha Tumkur Kailasa Murthy
harshutk@bu.edu
U00683580

## Files
---------------------------------------------------------------------------
Main Class - BoardGame  Class: Main Class which consists of the option panel to chose among the two games to play. 

Pawn Class : This class consists of attributes that a pawn can hold like pawn type, pawn color

Unit Class: Units class consists of color, indexes and position of each box (unit) in the board.

Board Class: The board class consists of various methods that can be done using units and pawn classes to build the layout and display it

Rules Class: The Rules Class consists of rules that is used for each game  to check the winner in different direction possible.

Player Class : Player class comprises of different properities that each player can hold - Player Name and Player Attribute

TicTacToe Class : TicTacToe Class is the main class for tic tac toe game, which has all components and functions called into one class.
                  This class has the complete display, structure and checks of the game that is presented in the output.

OrderandChaos Class :  Order and chaos Class is the main class for Order and chaos game, which has all components and functions called into one class.
                  This class has the display, structure and checks of the game that is presented in the output.



## Notes
---------------------------------------------------------------------------
1. For Tic tac toe game I have encoporated Admin side to customize the dimension of the board ( Admin password : Root123).
2. Order and chaos has fixed board size of 6 X 6.
3. Grader must note that the code was written in IntelliJ IDE.
3. Collaborated with Vishwas Bhaktavatsala, to discuss the infrastructure and logic of the games.

## How to compile and run
---------------------------------------------------------------------------
1. Please note that I have coded and excuted my program in IntellJ editor. 
2. Go to Main Class and excute the Class using run button.
3. 1. Navigate to the directory "boardgames" after unzipping the files
2. Run the following instructions:
<Example below>
javac -d bin src/*.java
java -cp bin BoardGame



## Input/Output Example
---------------------------------------------------------------------------
1. Output and Input are marked in the below ouputs of both programs (Tic tac toe and Order and chaos)

2. input marked with (-------> input ) in the below ouput.

***********************Welcome to Online Board Games***************************************
Please choose the game you want to play from the menu below  
 1. TIC TAC TOE (that to go game always to play) 
 2. ORDER & CHAOS 
1      -----------> Input
****************************************************************************************
                    Thank you for opting to play Tic-Tac-Toe
****************************************************************************************
The default size of the board is 3 X 3, If you wish to play with the customized size 
 Please enter Y else enter N
Y   -----------> Input
Enter the root password to proceed to dimension customization :4
4  -----------> Wrong Input provided
Oops you have failed to login as Admin 
 Totally only 3 chances are provided, where you have missed this one!!
Enter the root password to proceed to dimension customization :Root123
Root123  -----------> Input
you have successfully logged in as Admin
Please Enter the new dimension for the board
4  -----------> Input
Enter the name of Player1 :harshu
Please Enter your preferred pawn type. X and O are the only available pawn types
X -----------> Input
Enter the name of Player2 :
alexa
+---+---+---+---+
| 1 | 2 | 3 | 4 |
+---+---+---+---+
| 5 | 6 | 7 | 8 |
+---+---+---+---+
| 9 |10 |11 |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Game starts in
 3 
 2 
 1
Move1
 harshu please make your move: 
1 -----------> Input
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| 5 | 6 | 7 | 8 |
+---+---+---+---+
| 9 |10 |11 |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move2
 alexa please make your move: 
5 -----------> Input
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | 6 | 7 | 8 |
+---+---+---+---+
| 9 |10 |11 |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move3
 harshu please make your move: 
6 -----------> Input
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | X | 7 | 8 |
+---+---+---+---+
| 9 |10 |11 |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move4
 alexa please make your move: 
7 -----------> Input
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | X | O | 8 |
+---+---+---+---+
| 9 |10 |11 |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move5
 harshu please make your move: 
11  -----------> Input
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | X | O | 8 |
+---+---+---+---+
| 9 |10 | X |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move6
 alexa please make your move: 
8
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | X | O | O |
+---+---+---+---+
| 9 |10 | X |12 |
+---+---+---+---+
|13 |14 |15 |16 |
+---+---+---+---+
Move successfully placed
Move7
 harshu please make your move: 
16
+---+---+---+---+
| X | 2 | 3 | 4 |
+---+---+---+---+
| O | X | O | O |
+---+---+---+---+
| 9 |10 | X |12 |
+---+---+---+---+
|13 |14 |15 | X |
+---+---+---+---+
Move successfully placed

Winner available and the winner is harshu  --------> Final Output


Output 2 : Order and Chaos Example 

***********************Welcome to Online Board Games***************************************
Please choose the game you want to play from the menu below  
 1. TIC TAC TOE (that to go game always to play) 
 2. ORDER & CHAOS 
2
****************************************************************************************
                    Thank you for opting to play Order and Chaos
****************************************************************************************
The default size of the board is 6 X 6
Order and Chaos is a game played with X and O pawns, which can be chosen by any player for their each move. 
 Hope you have good game
Please Enter the name of the player playing as ORDER
harsh
Please Enter the name of the player playing as Chaos
Alexa
 Moves are placed once the player provides the position
Move1

 It is the turn of Order
 harsh Which pawn do you want to choose: 
x
 Please go ahead and Enter your move
11
+---+---+---+---+---+---+
| 1 | 2 | 3 | 4 | 5 | 6 |
+---+---+---+---+---+---+
| 7 | 8 | 9 |10 | X |12 |
+---+---+---+---+---+---+
|13 |14 |15 |16 |17 |18 |
+---+---+---+---+---+---+
|19 |20 |21 |22 |23 |24 |
+---+---+---+---+---+---+
|25 |26 |27 |28 |29 |30 |
+---+---+---+---+---+---+
|31 |32 |33 |34 |35 |36 |
+---+---+---+---+---+---+
Move successfully placed
Move2

 It is the turn of Chaos
 Alexa Which pawn do you want to choose: 
o
 Please go ahead and Enter your move
1
+---+---+---+---+---+---+
| O | 2 | 3 | 4 | 5 | 6 |
+---+---+---+---+---+---+
| 7 | 8 | 9 |10 | X |12 |
+---+---+---+---+---+---+
|13 |14 |15 |16 |17 |18 |
+---+---+---+---+---+---+
|19 |20 |21 |22 |23 |24 |
+---+---+---+---+---+---+
|25 |26 |27 |28 |29 |30 |
+---+---+---+---+---+---+
|31 |32 |33 |34 |35 |36 |
+---+---+---+---+---+---+
Move successfully placed
Move3

 It is the turn of Order
 harsh Which pawn do you want to choose: 
x
 Please go ahead and Enter your move
12
+---+---+---+---+---+---+
| O | 2 | 3 | 4 | 5 | 6 |
+---+---+---+---+---+---+
| 7 | 8 | 9 |10 | X | X |
+---+---+---+---+---+---+
|13 |14 |15 |16 |17 |18 |
+---+---+---+---+---+---+
|19 |20 |21 |22 |23 |24 |
+---+---+---+---+---+---+
|25 |26 |27 |28 |29 |30 |
+---+---+---+---+---+---+
|31 |32 |33 |34 |35 |36 |
+---+---+---+---+---+---+
Move successfully placed
Move4

 It is the turn of Chaos
 Alexa Which pawn do you want to choose: 
o
 Please go ahead and Enter your move
2
+---+---+---+---+---+---+
| O | O | 3 | 4 | 5 | 6 |
+---+---+---+---+---+---+
| 7 | 8 | 9 |10 | X | X |
+---+---+---+---+---+---+
|13 |14 |15 |16 |17 |18 |
+---+---+---+---+---+---+
|19 |20 |21 |22 |23 |24 |
+---+---+---+---+---+---+
|25 |26 |27 |28 |29 |30 |
+---+---+---+---+---+---+
|31 |32 |33 |34 |35 |36 |
+---+---+---+---+---+---+
Move successfully placed
Move5

 It is the turn of Order
 harsh Which pawn do you want to choose: 
x
 Please go ahead and Enter your move
7
+---+---+---+---+---+---+
| O | O | 3 | 4 | 5 | 6 |
+---+---+---+---+---+---+
| X | 8 | 9 |10 | X | X |
+---+---+---+---+---+---+
|13 |14 |15 |16 |17 |18 |
+---+---+---+---+---+---+
|19 |20 |21 |22 |23 |24 |
+---+---+---+---+---+---+
|25 |26 |27 |28 |29 |30 |
+---+---+---+---+---+---+
|31 |32 |33 |34 |35 |36 |
+---+---+---+---+---+---+
Move successfully placed

Move6

 It is the turn of Order
 harsh Which pawn do you want to choose: 

