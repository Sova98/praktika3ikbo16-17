public class Circle extends Shape {
    private double radius;

    public Circle(){}

    public Circle(double radius, String color, boolean filled){
        super(color, filled);

        this.radius = radius;
    }

    public void SetRadius(double radius){
        this.radius = radius;
    }

    public double GetRadius(){
        return this.radius;
    }

    @Override
    public double GetArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double GetPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle:" + " " + "radius:" + " " + this.radius + " " + "color:" + " " + super.GetColor() + " "
                + "filled:" + " " + super.IsFilled();
    }
}
