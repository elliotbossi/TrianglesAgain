public class Triangle{

  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    double first = v1.distanceTo(v2);
    double second = v1.distanceTo(v3);
    double third = v2.distanceTo(v3);
    return (first + second + third);
  }

  public double getArea(){
    double first = v1.distanceTo(v2);
    double second = v1.distanceTo(v3);
    double third = v2.distanceTo(v3);
    double s = ((first + second + third) / 2.0)  ;
    return (Math.sqrt(s*(s-first)*(s-second)*(s-third)));
  }

  public String classify(){
    double first = ((Math.round(v1.distanceTo(v2)*10000.0))/10000.0);
    double second = ((Math.round(v1.distanceTo(v3)*10000.0))/10000.0);
    double third = ((Math.round(v2.distanceTo(v3)*10000.0))/10000.0);
    if ((first == second) && (second == third)) {
      return "equilateral";
    }
    else if (((first == second) || (second == third)) || (third == first)) {
      return "isosceles";
    }
    else {
      return "scalene";
    }
  }

  public String toString(){ //"v1(23.0, 4.0) v2(-2.3, 5.001) v3(5.0, 0.52)"
    return ("v1("+(Double.toString(v1.getX()))+", "+(Double.toString(v1.getY()))+
    ") "+"v2("+(Double.toString(v2.getX()))+", "+(Double.toString(v2.getY()))+
    ") "+"v3("+(Double.toString(v3.getX()))+", "+(Double.toString(v3.getY()))+")");
  }

  public void setVertex(int index, Point newP){
    if (index == 0){
      v1 = newP;
    }
    if (index == 1){
      v2 = newP;
    }
    if (index == 2){
      v3 = newP;
    }
  }
}
