/**
 * Units class consists of color, indexes and position of each box (unit) in the board.
 *
 * @author : Harshitha
 * @version : 1.0
 * @date : 09/26/2022
 */

/*import Pawn.java; import not needed as it is in the default package*/
public class Unit {
    private String unitColor;
    private Integer unitPosition;
    private Integer unitIndexA;
    private Integer unitIndexB;
    private Pawn pawnUnit;

    Unit(String unitColor, Integer unitPosition, Integer unitIndexA, Integer unitIndexB) {
        this.setUnitColor(unitColor);
        this.setUnitPosition(unitPosition);
        this.setUnitIndexA(unitIndexA);
        this.setUnitIndexB(unitIndexB);
    }

    public String getUnitColor() {
        return this.unitColor;
    }

    public void setUnitColor(String unitColor) {
        this.unitColor = unitColor;
    }

    public Integer getUnitPosition() {
        return this.unitPosition;

    }

    public void setUnitPosition(Integer unitPosition) {
        if (unitPosition <= 0) {
            throw new RuntimeException("The index of position is <= 0" + unitPosition);
        }
        this.unitPosition = unitPosition;
    }

    public Integer getUnitIndexA() {
        return this.unitIndexA;

    }

    public void setUnitIndexA(Integer unitIndexA) {
        if (unitIndexA < 0) {
            throw new RuntimeException("The index of A value is invalid" + unitIndexA);
        }
        this.unitIndexA = unitIndexA;
    }

    public Integer getUnitIndexB() {
        return this.unitIndexB;
    }

    public void setUnitIndexB(Integer unitIndexB) {
        if (unitIndexB < 0) {
            throw new RuntimeException("The index of B value is invalid" + unitIndexB);
        }
        this.unitIndexB = unitIndexB;
    }

    public Pawn getPawnUnit() {
        return this.pawnUnit;
    }

    public void setPawnUnit(Pawn pawnUnit) {
        this.pawnUnit = pawnUnit;
    }

    @Override
    public String toString() {
        return " " + unitColor + " " + unitPosition + " " + unitIndexA + " " + unitIndexB + " " + pawnUnit;
    }

    public Boolean isUnitEmpty() {
        return this.getPawnUnit() == null;

    }
}
