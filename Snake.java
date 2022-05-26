public class Snake extends Cell{
  

  public Snake(int row, int col) {
    super(row, col);
  }

  public String toString() {
    return "Snake: " + getRow() + "/" + getCol();
  }
}