public class Rules {

    public static boolean checkMovePossible(Board board, Integer rowIndex, Integer columnIndex) {
        return board.getBoard()[rowIndex][columnIndex].isUnitEmpty();
    }

    public static void makeMove(Board board, Pawn pawn, Integer rowIndex, Integer columnIndex) {
        if (checkMovePossible(board, rowIndex, columnIndex)) {
            board.getBoard()[rowIndex][columnIndex].setPawnUnit(pawn);
        } else {
            throw new RuntimeException("Pawn is already present in the unit provided by you. Please choose a different position");
        }
    }

    public static boolean verticalResolve(Board board, Integer columnIndex, Integer rowIndex) {
        System.out.println("Vertical Check");
        for (int row = 0; row < board.getRow(); row++) {
            if (row != rowIndex) {
                if (board.getBoard()[row][columnIndex].isUnitEmpty()) {
                    return false;
                } else if (!(board.getBoard()[rowIndex][columnIndex].getPawnUnit().getPawnType().equals(board.getBoard()[row][columnIndex].getPawnUnit().getPawnType()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean horizontalResolve(Board board, Integer columnIndex, Integer rowIndex) {
        System.out.println("Horizontal Check");
        for (int col = 0; col < board.getColumn(); col++) {
            if (col != columnIndex) {
                if (board.getBoard()[rowIndex][col].isUnitEmpty()) {
                    return false;
                } else if (!(board.getBoard()[rowIndex][columnIndex].getPawnUnit().getPawnType().equals(board.getBoard()[rowIndex][col].getPawnUnit().getPawnType()))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean diagonalResolve(Board board, Integer columnIndex, Integer rowIndex) {
        System.out.println("Diagonal Check");
        boolean status = true;
        if (board.getRow() % 2 == 0) {
            if (rowIndex.equals(columnIndex)) {
                for (int indexI = 0; indexI < board.getRow(); indexI++) {
                    if (indexI != columnIndex) {
                        if (board.getBoard()[indexI][indexI].isUnitEmpty()) {
                            status = false;
                        } else if (!(board.getBoard()[rowIndex][columnIndex].getPawnUnit().getPawnType().equals(board.getBoard()[indexI][indexI].getPawnUnit().getPawnType()))) {
                            status = false;
                        }
                    }
                }
            }
            if (status) {
                return status;
            }
        }

        if (!rowIndex.equals(columnIndex) || board.getColumn() % 2 != 0 && board.getRow() / 2 == rowIndex) {
            for (int indexI = 0, indexJ = board.getColumn() - 1; indexI < board.getRow() && indexJ >= 0; indexI++, indexJ--) {
                if (indexI != rowIndex && indexJ != columnIndex) {
                    if (board.getBoard()[indexI][indexJ].isUnitEmpty()) {
                        status = false;
                        break;
                    } else if (!(board.getBoard()[rowIndex][columnIndex].getPawnUnit().getPawnType().equals(board.getBoard()[indexI][indexJ].getPawnUnit().getPawnType()))) {
                        status = false;
                        break;
                    }
                }
            }

        }
        return status;
    }

    public static boolean resolveGame(Board board, Integer rowIndex, Integer columnIndex) {

        if ((verticalResolve(board, columnIndex, rowIndex) || horizontalResolve(board, columnIndex, rowIndex))) {
            return true;
        } else if ((rowIndex.equals(columnIndex) || (columnIndex + rowIndex) == columnIndex - 1) && diagonalResolve(board, columnIndex, rowIndex)) {
            return true;
        }
        return false;
    }
}


