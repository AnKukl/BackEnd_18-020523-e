public class Cell {
    private boolean isShip;

    public Cell(boolean isFree) {
        this.isShip = isFree;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return isShip == cell.isShip;
    }

    @Override
    public int hashCode() {
        return (isShip ? 1 : 0);
    }

    public String toString() {
        if (isShip) {
            return "\uD83D\uDEA2";
        } else {
            return "";
        }
    }
}
