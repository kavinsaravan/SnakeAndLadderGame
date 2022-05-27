 public class Player{
  public int row = 0;
  public int col = 0;
  private Game game;
  private int colLength;
  private int rowLength;
  private String name;
	
  public Player(Game g, String n){
    game = g;
    this.colLength = game.getColLength();
    this.rowLength = game.getRowLength(); 
    name = n;
	}

  public void play() {
    int roll = (int)((Math.random() * 6) + 1);
    int savedCol = col;
    col += roll;
    if (col > colLength - 1) {
      col %= colLength;
      if ((row + 1) > rowLength - 1) {
        col = savedCol;
        return;
      }
      row += 1;
    }
    System.out.println(name + " rolled a " + roll + " and moved to row " + row + ", col " + col);
    Cell c = game.getCell(row, col); 
    if (c instanceof Snake) {
      Snake s = (Snake)c;
      row = s.getEndRow();
      col = s.getEndCol();
      System.out.println("You got bitten by a snake and moved to " + row + "," + col);
    } else if (c instanceof Ladder) {
      Ladder l = (Ladder)c;
      row = l.getEndRow();
      col = l.getEndCol();
      System.out.println("You climbed a ladder and moved to " + row + "," + col);
    }
  }

  public String toString(){
    return name;
  }
}