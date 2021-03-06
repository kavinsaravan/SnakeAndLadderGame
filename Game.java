public class Game {
  private Cell[][] grid = new Cell[5][10];
  private Player player1;
  private Player player2;
  private Player nextPlayer;  

	public Game(Snake[] snakes, Ladder[] ladders, String nameOne, String nameTwo){
    player1 = new Player(this, nameOne);
    player2 = new Player(this, nameTwo);
    nextPlayer = player1;
    for(int i = 0; i < snakes.length; i++) {
      grid[snakes[i].getStartRow()][snakes[i].getStartCol()] = snakes[i];
    }
    for(int i = 0; i < ladders.length; i++) {
      grid[ladders[i].getStartRow()][ladders[i].getStartCol()] = ladders[i];
    }
  }

  public void printBoard() {
    for (int i = grid.length - 1; i >= 0; i--){
			for (int j = 0; j < grid[i].length; j++){
        if (grid[i][j] == null){
          System.out.print(" " + "  |  ");
        } else {
				  System.out.print(grid[i][j] + "  |  ");
        }
			}
      System.out.println();
      for (int k = 0; k < 20; k++) {
        System.out.print(" - ");
      }
      System.out.println();
		}
  }

  public Cell getCell(int x, int y) {
    return grid[x][y];
  }

  public Player play(){
    nextPlayer.play();
    if (grid.length % 2 == 0) {
      if(nextPlayer.row == grid.length-1 && nextPlayer.col == 0){
        return nextPlayer;
      }
    } else {
      if(nextPlayer.row == grid.length-1 && nextPlayer.col == grid[0].length - 1){
        return nextPlayer;
      }
    }
    
    if(nextPlayer == player1) {
      nextPlayer = player2;
    } else {
      nextPlayer = player1;
    }
    return null;
  }

  public int getColLength(){
    return grid[0].length;
  }
  public int getRowLength(){
    return grid.length;
  }
}
	
	