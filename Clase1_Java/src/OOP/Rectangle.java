package OOP;

public class Rectangle {
    double base;
    double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void perimeter(){
        System.out.printf("El perimetro del rectángulo es %.2f%n",(2*base + 2*height));
    }
    public void area(){
        System.out.printf("El área del rectángulo es %.2f%n",(base*height)/2);
    }
}