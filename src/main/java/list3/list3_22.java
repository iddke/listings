package list3;

abstract class Shape {
    abstract double area (); // метод area ()
} // Shape class
class Point extends Shape {
    public String toString() {return "Точка";}
    double area() {return 0;} // площадь точки равна 0
} // Point class

class Triangle extends Shape{
    int cathetus1; // первый катет
    int cathetus2; // второй катет

    Triangle (int cathetus1, int cathetus2) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;

    }  // Triangle (int, int) constructor
    public String toString() {return "Треугольник" ;}
    double area () {
        return ((cathetus1 * cathetus2) / 2.0) ;
    } // area() method of Triangle class
} // Triangle class

class Circle extends Shape {
    int radius; // радиус

    Circle(int radius) {
        this.radius = radius;
    } // Circle(int) constructor

    public String toString() {return "Круг";}

    double area() {
        return ((radius * radius) * 3.14);
    }// area() method of Circle class
}

class ShapeDemo {
    public static void main(String[] args) {

        Point p = new Point();
        Triangle t = new Triangle(5, 3);
        Circle c = new Circle(9);
        Shape[] s = {p, t, c};

        System.out.println("Расчет площади фигур");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString() + " : " + s[i].area());
        } // for
    } // main
} // ShapeDemo
