public class Cell {
  private int row;
  private int col;
  
  public Cell(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public Cell(){
  }

  public String toString(){
    return "[ ]";
  }

  public int getRow(){
    return row;
  }

  public int getCol(){
    return col;
  }
}