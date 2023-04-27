import java.lang.Math;

abstract class shape {
    int a, b;

    abstract double area(int a, int b);
}

class Rectangle extends shape {
    double area(int a, int b) {
        return a * b;
    }
}

class Triangle extends shape {
    double area(int a, int b) {
        return (a * b) / 2;
    }

}

class Circle extends shape {
    double area(int a, int b) {
        return Math.PI * (double) a * (double) a;
    }
}