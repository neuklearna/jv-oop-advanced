package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random rand = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = rand.nextInt(5);
        switch (type) {
            case 0:
                double radius = rand.nextDouble() * 100;
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 1:
               double width = rand.nextDouble() * 100;
               double height = rand.nextDouble() * 100;
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 2:
                double firstLeg = rand.nextDouble() * 100;
                double secondLeg = rand.nextDouble() * 100;
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                int topBase = rand.nextInt(100);
                int bottomBase = rand.nextInt(100);
                int heightBase = rand.nextInt(100);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),topBase, bottomBase, heightBase);
            case 4:
                double side = rand.nextDouble() * 100;
                return new Square(colorSupplier.getRandomColor(), side);
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return  new Circle("WHITE", 10);
    }
}
