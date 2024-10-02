import java.util.Scanner;

public class q2 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter yr first name");
        String firstname=scanner.next();

        System.out.println("Enter yr middle name");
        String midname=scanner.next();

        System.out.println("Enter yr last name");
        String lastname=scanner.next();

        System.out.println(lastname+", "+firstname+" "+midname.charAt(0)+"." );
    }
}
