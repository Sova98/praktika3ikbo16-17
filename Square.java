public class Square extends Rectangle{
    public Square(){}

    public Square(double side){
        super.SetWidth(side);
        super.SetLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);

        super.SetWidth(side);
        super.SetLength(side);
    }

    public double GetSide(){
        return super.GetLength();
    }

    public void SetSide(double side){
        super.SetLength(side);
        super.SetWidth(side);
    }

    @Override
    public void SetWidth(double width) {
        SetSide(width);
    }

    @Override
    public void SetLength(double length) {
        SetSide(length);
    }

    @Override
    public String toString() {
        return "Square:" + " " + "side:" + " " + super.GetWidth() + " " + "color:"
                + " " + super.GetColor() + " " + "filled:" + " " + super.IsFilled();
    }
}
