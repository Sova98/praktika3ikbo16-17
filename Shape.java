public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){}

    public String GetColor(){
        return this.color;
    }

    public void SetColor(String color){
        this.color = color;
    }

    public boolean IsFilled(){
        return this.filled;
    }

    public  void SetFilled(boolean filled){
        this.filled = filled;
    }

    abstract double GetArea();

    abstract double GetPerimeter();

    public abstract String toString();
}
