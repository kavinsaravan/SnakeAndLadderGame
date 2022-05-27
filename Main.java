import java.util.*;

class Main {
  public static void main(String[] args) {
   Snake[] snakes = {
        new Snake(1, 1, 0, 2), 
        new Snake(1, 6, 0, 5), 
        new Snake(3, 1, 2, 3), 
        new Snake(3, 5, 1, 3), 
        new Snake(4, 3, 3, 4), 
        new Snake(4, 8, 2, 7),
   };
   Ladder[] ladders = {
        new Ladder(0, 5, 2, 5), 
        new Ladder(0, 9, 1, 8), 
        new Ladder(1, 5, 2, 6), 
        new Ladder(2, 2, 4, 5), 
        new Ladder(2, 6, 4, 7),
   };
   Scanner input = new Scanner(System.in);
   System.out.println("What is player 1's name? ");
   String nameOne = input.nextLine();
   Scanner secondInput = new Scanner(System.in);
   System.out.println("What is player 2's name? ");
   String nameTwo = input.nextLine();
   Game grid = new Game(snakes, ladders, nameOne, nameTwo);

  for (int i = 0; i < 20; i++) {
    System.out.print(" - ");
  }
  System.out.println();
  grid.printBoard();
  System.out.println();
  while (true) {
    Player p = grid.play();
    if(p != null){
      System.out.println(p + " won!");
      break;
    }
  }
 }
}