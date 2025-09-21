abstract class Shape {
    protected float area;

    public abstract void calcArea();

    public void show() {
        System.out.println("The area of the shape is: " + area);
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calcArea() {
        super.area = side * side;
    }
}

class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calcArea() {
        super.area = height * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Square sq = new Square(8);
        sq.calcArea();
        sq.show();

        Rectangle r = new Rectangle(7, 3);
        r.calcArea();
        r.show();
    }
}
