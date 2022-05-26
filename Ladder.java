public class Ladder extends Cell{
  

  public Ladder(int startRow, int startCol, int endRow, int endCol) {
    super(startRow, startCol, endRow, endCol);
  }

  public String toString() {
    return "Ladder: " + getStartRow() + "/" + getStartCol();
  }
}