public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){}

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);

        this.width = width;
        this.length = length;
    }

    public double GetWidth(){
        return width;
    }

    public  double GetLength(){
        return length;
    }

    public void SetWidth(double width){
        this.width = width;
    }

    public void SetLength(double length){
        this.length = length;
    }

    @Override
    double GetArea() {
        return this.width*this.length;
    }

    @Override
    double GetPerimeter() {
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "Rectangle:" + " " + "width:" + " " + this.width + "length:" + " " + this.length + " " + "color:"
                + " " + super.GetColor() + " " + "filled:" + " " + super.IsFilled();
    }
}
