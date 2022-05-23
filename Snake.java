public class Snake extends ClimbOrDescend{
  int x;
  int y; 

  public Snake(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "Snake " + x + "/" + y;
  }
}