package practice.polymorphism;

public class Main {

    static void draw (Figure figure) {
        //if(/*circle*/)...
        //if(/*circle*/)...
        figure.drawFigure();

        Figure figure1 = new Figure();
        Figure figure2 = new Figure();

        figure1.equals(figure2);
    }

    public static void main(String[] args) {

        Figure circle = new Circle();

        Figure square = new Square();

        Triangle triangle = new Triangle();

        draw(triangle);
    }
}
