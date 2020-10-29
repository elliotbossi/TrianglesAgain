public class Tester{
  public static void main(String[]args){
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,4);
    Point p3 = new Point(3,0);
    Triangle t = new Triangle(p1,p2,p3);

    System.out.println(p1.distanceTo(p2));
    System.out.println(t.getPerimeter());
    System.out.println(t.getArea());

  }

}
