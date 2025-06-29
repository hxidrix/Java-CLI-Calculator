import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcCore cc = new CalcCore();
        char ch;
        boolean ft = true;
          do {
            if (ft) 
            {
                System.out.println("Enter first value: ");
                cc.n1 = sc.nextInt();
                ft = false;
            } else {
                cc.n1 = cc.res; 
                System.out.println("Previous result becomes first value: " + cc.n1);
            }
            System.out.println("Enter operation (+, -, *, /)");
            cc.op = sc.next().charAt(0);
            System.out.println("Enter next number to perform operation: ");
            cc.n2 = sc.nextInt();
            cc.show();
            System.out.println("continue? (y/n)");
            ch = sc.next().charAt(0);
        } 
        while (ch == 'y' || ch == 'Y');
        System.out.println("\n--- Operation Result ---");
        System.out.println(cc.n1 + " " + cc.op + " " + cc.n2 + " = " + cc.res);
        System.out.println("------------------------\n");
        sc.close();
    }
}