package core.basesyntax;

public class Figure {
    private final String color;

    public Figure (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void draw() {
        System.out.println("Color: " + color);

    }
}
