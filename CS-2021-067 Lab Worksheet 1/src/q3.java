import java.util.Scanner;

public class q3 {

    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length in centimetres");
        double length=scanner.nextDouble();

        double inches=length/(2.54);
        int feet=(int)inches/12;
        inches=inches%12;

        System.out.println(feet+" feet and "+inches+" inches:");
    }
}