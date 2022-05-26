public class Ladder extends Cell{
  

  public Ladder(int row, int col) {
    super(row, col);
  }

  public String toString() {
    return "Ladder: " + getRow() + "/" + getCol();
  }
}