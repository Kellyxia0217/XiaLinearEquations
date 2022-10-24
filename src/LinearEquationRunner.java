import java.util.*;
public class LinearEquationRunner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String cord1 = (input.nextLine());
        System.out.print("Enter coordinate 2: ");
        String cord2 = (input.nextLine());
        System.out.println();
        int Comma = cord1.indexOf(",");
        String X1 = cord1.substring(1,Comma);
        int c1 = Integer.parseInt(X1);
        String Y1 = cord1.substring(Comma + 1, cord1.length()-1);
        int c2 = Integer.parseInt(Y1);
        String X2 = cord2.substring(1,Comma);
        int c3 = Integer.parseInt(X2);
        String Y2 = cord2.substring(Comma + 1, cord1.length()-1);
        int c4 = Integer.parseInt(Y2);
        LinearEquation Cords = new LinearEquation (c1,c2,c3,c4);
        System.out.print




    }
}
