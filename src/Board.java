/**
 * The board class consists of various methods that can be done using units and pawn classes to build the layout and display it
 *
 * @author : Harshitha
 * @version : 1.0
 * @date : 09/27/2022
 */

public class Board {

    private Integer row;
    private Integer column;
    private Unit[][] boardArray;


    Board(Integer row, Integer column) {
        this.setRow(row);
        this.setColumn(column);


    }

    public Integer getRow() {
        return this.row;
    }

    public void setRow(Integer row) {
        if (row <= 0) {
            throw new RuntimeException("row value is invalid");
        }
        this.row = row;
    }

    public Integer getColumn() {
        return this.column;
    }

    public void setColumn(Integer column) {
        if (column <= 0) {
            throw new RuntimeException("column value is invalid");
        }
        this.column = column;
    }

    /**
     * The createBoard method creates the board using rows and columns and updates the position to keep track
     */
    public void createBoard() {
        boardArray = new Unit[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                boardArray[i][j] = new Unit("white", (column * i) + 1 + j, i, j);

            }
        }

    }

    /**
     * The displayBoard method displays the existing board when method is called
     */
    public void displayBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("+---");
            }
            System.out.println("+");
            for (int j = 0; j < column; j++) {
                if (boardArray[i][j].getPawnUnit() != null) {
                    System.out.print("|" + " " + boardArray[i][j].getPawnUnit().getPawnType() + " ");

                } else if (boardArray[i][j].getUnitPosition() > 9) {
                    System.out.print("|" + boardArray[i][j].getUnitPosition() + " ");
                } else {
                    System.out.print("|" + " " + boardArray[i][j].getUnitPosition() + " ");
                }
            }
            System.out.println("|");
        }
        for (int j = 0; j < column; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    /**
     *
     */
    public Unit[][] getBoard() {
        return this.boardArray;

    }

}
