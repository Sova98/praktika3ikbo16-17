public class testShape {
    public static void main(String[] args){

      Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
      System.out.println(s1); // which version?
      System.out.println(s1.GetArea()); // which version?
      System.out.println(s1.GetPerimeter()); // which version?
      System.out.println(s1.GetColor());
      System.out.println(s1.IsFilled());
      //System.out.println(s1.GetRadius());
      // в объекте класса shape нет метода getRadius

      Circle c1 = (Circle)s1; // Downcast back to Circle
       System.out.println(c1);
       System.out.println(c1.GetArea());
       System.out.println(c1.GetPerimeter());
       System.out.println(c1.GetColor());
       System.out.println(c1.IsFilled());
       System.out.println(c1.GetRadius());
      
       //Shape s2 = new Shape();
       // нельзя создать объект от абстрактного класса
       Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
       System.out.println(s3);
       System.out.println(s3.GetArea());
       System.out.println(s3.GetPerimeter());
       System.out.println(s3.GetColor());
       //System.out.println(s3.GetLength());
       // в объекте класса shape нет метода GetLength

        Rectangle r1 = (Rectangle)s3; // downcast
       System.out.println(r1);
       System.out.println(r1.GetArea());
       System.out.println(r1.GetColor());
       System.out.println(r1.GetLength());
      
       Shape s4 = new Square(6.6); // Upcast
       System.out.println(s4);
       System.out.println(s4.GetArea());
       System.out.println(s4.GetColor());
       //System.out.println(s4.GetSide());
       // в объекте класса shape нет метода GetSide

        // Take note that we downcast Shape s4 to Rectangle,
       // which is a superclass of Square, instead of Square
       Rectangle r2 = (Rectangle)s4;
       System.out.println(r2);
       System.out.println(r2.GetArea());
       System.out.println(r2.GetColor());
       //System.out.println(r2.GetSide());
       // в объекте класса Rectangle нет метода GetSide
       System.out.println(r2.GetLength());

        // Downcast Rectangle r2 to Square
       Square sq1 = (Square)r2;
       System.out.println(sq1);
       System.out.println(sq1.GetArea());
       System.out.println(sq1.GetColor());
       System.out.println(sq1.GetSide());
       System.out.println(sq1.GetLength());

    }
}
