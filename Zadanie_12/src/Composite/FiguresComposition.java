package Composite;

import java.util.ArrayList;
import java.util.List;

public class FiguresComposition {

    String name;
    List<Figure> figures;

    public FiguresComposition(String name) {

        this.name = name;
        this.figures = new ArrayList<>();

    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }

}