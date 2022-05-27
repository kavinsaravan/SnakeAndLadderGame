public class Snake extends Cell{
  
  public Snake(int startRow, int startCol, int endRow, int endCol) {
    super(startRow, startCol, endRow, endCol);
  }

  public String toString() {
    return "S" /*+ getStartRow() + "," + getStartCol()*/;
  }
}