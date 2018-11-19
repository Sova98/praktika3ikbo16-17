public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    @Override
    public String toString() {
        return "MovablePoint: x :" + this.x + ", y :" + this.y +
                ", xSpeed :" + this.xSpeed + ", ySpeed :" + this.ySpeed;
    }
}
