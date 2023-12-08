import Composite.Circle;
import Composite.Figure;
import Composite.FiguresComposition;
import Composite.Square;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(100, 100);

        Figure square = new Square(100, 100);

        FiguresComposition figuresComposition = new FiguresComposition("topcheg");

        figuresComposition.addFigure(circle);
        figuresComposition.addFigure(square);

        figuresComposition.removeFigure(circle);
    }
}