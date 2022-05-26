 import java.util.*;

class Main {
  public static void main(String[] args) {
   Game grid = new Game();
   grid.printBoard();
   while (true) {
     Player p = grid.play();
     if(p != null){
       System.out.print(p + " you won! \n");
       break;
     }
    }
  }
}