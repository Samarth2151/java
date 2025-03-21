abstract class shapes {
    int dim1, dim2;
    shapes(int a, int b) {
        dim1 = a;
        dim2 = b;
    }
    abstract void area();
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);
        r.area();
        t.area();
    }
}
class Rectangle extends shapes {
    Rectangle(int a, int b) {
        super(a, b);
    }
    void area() {
        System.out.println("Rectangle Area: " + (dim1 * dim2));
    }
}
class Triangle extends shapes {
    Triangle(int a, int b) {
        super(a, b);
    }
    void area() {
        System.out.println("Triangle Area: " + (0.5 * dim1 * dim2));
    }
}
