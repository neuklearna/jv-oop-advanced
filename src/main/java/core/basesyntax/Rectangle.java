package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle (String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure is Rectangle");
        super.draw();
        System.out.println("Rectangle width is " + width);
        System.out.println("Rectangle height is " + height);
        System.out.println("Area is " + String.format("%.2f", getArea()));
    }
}
