public class Game {
  private Cell[][] grid = { 
      {
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Ladder(2, 5), 
        new Cell(),
        new Cell(),
        new Cell(),
        new Ladder(1, 8), 
      },
       {
        new Cell(),
        new Snake(0, 2), 
        new Cell(),
        new Cell(),
        new Cell(),
        new Ladder(2, 6), 
        new Snake(0, 5), 
        new Cell(),
        new Cell(),
        new Cell(),
      },
       {
        new Cell(),
        new Cell(),
        new Ladder(4, 5), 
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
      },
       {
        new Cell(),
        new Snake(2, 3), 
        new Cell(),
        new Cell(),
        new Cell(),
        new Snake(1, 3), 
        new Ladder(4, 7),
        new Cell(),
        new Cell(),
        new Cell(),
      },
       {
        new Cell(),
        new Cell(),
        new Cell(),
        new Snake(3, 4), 
        new Cell(),
        new Cell(),
        new Cell(),
        new Cell(),
        new Snake(2, 7),
        new Cell(),
    }
  };
  private Player player1;
  private Player player2;
  private Player nextPlayer;

	public Game(){
    player1 = new Player(this);
    player2 = new Player(this);
    nextPlayer = player1;
  }

  public void printBoard() {
    for (int i = grid.length - 1; i >= 0; i--){
			for (int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j] + ", ");
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
	
	