public class Ladder extends ClimbOrDescend{
  int x;
  int y; 

  public Ladder(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "Ladder " + x + "/" + y;
  }
}