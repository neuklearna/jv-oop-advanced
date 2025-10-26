package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public void setBottomBase(int bottomBase) {
        this.bottomBase = bottomBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    public int getHeight() {
        return height;
    }

    public double getArea(){
        return (topBase + bottomBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure is IsoscelesTrapezoid");
        super.draw();
        System.out.println("Top Base is " + topBase);
        System.out.println("Bottom Base is " + bottomBase);
        System.out.println("Height is " + height);
        System.out.println("Area is " + String.format("%.2f", getArea()));
    }
}
