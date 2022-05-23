public class Grid {
  private ClimbOrDescend[][] grid = { 
      {
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Ladder(2, 5), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
         new Ladder(1, 8), 
      },
       {
        new ClimbOrDescend(),
        new Snake(1, 1), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Ladder(2, 6), 
        new Snake(1, 6), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend()
      },
       {
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Ladder(4, 5), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend()
      },
       {
        new ClimbOrDescend(),
        new Snake(3, 1), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Snake(3, 5), 
        new Ladder(4, 7),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend()
      },
       {
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Snake(4, 3), 
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new ClimbOrDescend(),
        new Snake(4, 8),
        new ClimbOrDescend()
      }
    };

	public Grid(){
    
  }

  public void printBoard() {
    for (int i = grid.length - 1; i >= 0; i--){
			for (int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j] + ", ");
			}
      System.out.println();
		}
  }
  
  public int rollDice(){
    int roll = 0;
	  roll = (int)((Math.random() * 6) + 1);
		System.out.println("You rolled a " + roll);
		return roll;
	}
}
	
	