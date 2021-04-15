package turtleGraphics;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
       this.rowPosition=rowPosition;
       this.columnPosition=columnPosition;
    }

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }

    @Override
    public boolean equals(Object anotherPosition) {
        //type
      if (anotherPosition.getClass()!=this.getClass()){
          return false;
      }
       Position convertedPosition=(Position) anotherPosition;
      boolean columnAreEqual= convertedPosition.columnPosition==this.columnPosition;
      boolean rowAreEqual= convertedPosition.rowPosition==this.rowPosition;
      return columnAreEqual && rowAreEqual;
    }

    public void increaseColumnPositionBy(int numberOfSteps) {
        columnPosition += numberOfSteps;
    }
}
