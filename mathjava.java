interface Polygon {
  void getArea();
}
class Rectangle implements Polygon {
  public void getArea() {
    int length = 6;
    int breadth = 5;
    int area = length * breadth;
    System.out.println("The area of the rectangle is " + area);
  }
}
class Square implements Polygon {
  public void getArea() {
    int length = 5;
    int area = length * length;
    System.out.println("The area of the square is " + area);
  }
}

class mathjava {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea();
    Square s1 = new Square();
    s1.getArea();
  }
}
