public class Cell {
  private int startingRow;
  private int startingCol;
  private int endingRow;
  private int endingCol;
  
  public Cell(int startRow, int startCol, int endRow, int endCol) {
    startingRow = startRow;
    startingCol = startCol;
    endingRow = endRow;
    endingCol = endCol;
  }

  public Cell(){
  }

  public String toString(){
    return "[ ]";
  }
  public int getStartRow(){
    return startingRow;
  }
  public int getStartCol(){
    return startingCol;
  }
  public int getEndRow(){
    return endingRow;
  }
  public int getEndCol(){
    return endingCol;
  }
}