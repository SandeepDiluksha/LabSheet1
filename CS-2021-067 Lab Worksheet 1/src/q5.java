import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of inner circle");
        double ri = scanner.nextDouble();

        System.out.print("Enter radius of outer circle");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double circular_region=outerCircle.computeArea()- innerCircle.computeArea();

        System.out.println("Area of a circular region : " + circular_region);
    }
}

class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference(){
        return 2 * Math.PI * radius;
    }
}