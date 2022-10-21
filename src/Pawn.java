/**
 * This class consists of attributes that a pawn can hold like pawn type, pawn color,
 * *
 * * @author : Harshitha
 * * @version : 1.0
 * * @date : 09/26/2022
 */

public class Pawn {
    private String pawnColor;
    private String pawnType;

    Pawn(String pawnColor, String pawnType) {
        this.setPawnColor(pawnColor);
        this.setPawnType(pawnType);

    }

    public String getPawnColor() {
        return this.pawnColor;
    }

    public void setPawnColor(String pawnColor) {
        this.pawnColor = pawnColor;
    }

    public String getPawnType() {
        return this.pawnType;
    }

    public void setPawnType(String pawnType) {
        this.pawnType = pawnType;
    }
}
