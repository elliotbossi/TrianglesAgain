public class Point {
  private double x, y;

  public Point(double X, double Y) {
    x = X;
    y = Y;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
      return (Math.sqrt((((getX())-(other.getX()))*((getX())-(other.getX()))) + (((getY())-(other.getY()))*((getY())-(other.getY())))));
  }

  public boolean equals(Point other){
    return (((getX()) == (other.getX())) && ((getY()) == (other.getY())));
  }
}
