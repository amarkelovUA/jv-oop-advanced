package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int SIZE = 6;
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[SIZE];

        for (int i = 0; i < SIZE / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = SIZE / 2; i < SIZE; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            System.out.println(showInfo(figure));
        }
    }

    private static String showInfo(Figure figure) {
        return "Figure: " + figure + ", area: " + figure.getArea() + " sq.units.";
    }
}
