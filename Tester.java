public class Tester{
  public static void main(String[]args){
    Point p1 = new Point(0,0);
    Point p2 = new Point(0,4);
    Point p3 = new Point(3,0);
    Triangle t = new Triangle(p1,p2,p3);
    Point p4 = new Point(2.5,4.33013);
    Point p5 = new Point(5,0);
    Point p6 = new Point(0,0);
    Triangle t1 = new Triangle(p4,p5,p6);

    System.out.println(p1.distanceTo(p2));
    System.out.println(t.getPerimeter());
    System.out.println(t.getArea());
    System.out.println(t.classify());
    System.out.println(t1.classify());
    System.out.println(t.toString());
    t.setVertex(0, p2);
    System.out.println(t.toString());

  }

}
