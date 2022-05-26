 public class Player{
  public int row = 0;
  public int col = 0;
  private Game game;
  private int colLength;
  private int rowLength;
	
  public Player(Game g){
    game = g;
    this.colLength = game.getColLength();
    this.rowLength = game.getRowLength(); 
	}

  private int rollDice(){
	  int roll = (int)((Math.random() * 6) + 1);
		return roll;
	}

  public void play() {
    int roll = rollDice();
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
    System.out.println("you rolled a " + roll + " and your position is " + row + "," + col);
    Cell c = game.getCell(row, col); 
    if (c instanceof Snake) {
      Snake s = (Snake)c;
      row = s.getEndRow();
      col = s.getEndCol();
    } else if (c instanceof Ladder) {
      Ladder l = (Ladder)c;
      row = l.getEndRow();
      col = l.getEndCol();
    }
  }
}