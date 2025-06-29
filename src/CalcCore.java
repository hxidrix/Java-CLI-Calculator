public class CalcCore {
    double n1, n2;
    double res;
    char op;
    void show() {
        if (op == '+') {
            res = n1 + n2; 
            System.out.println("Result of "+ n1 +" "+ op +" "+ n2+" is "+ res);
        } else if (op == '-') {
            res = n1 - n2;
            System.out.println("Result of "+ n1 +" "+ op +" "+ n2+" is "+ res);
        } else if (op == '*') {
            res = n1 * n2;
            System.out.println("Result of "+ n1 +" "+ op +" "+ n2+" is "+ res);
        } else if (op == '/') {
            if (n2 != 0) {
                res = (double) n1 / n2;
                System.out.println("Result of "+ n1 +" "+ op +" "+ n2+" is "+ res);
            } else if (n2 == 0) {
                System.out.println("ERROR! Cannot divide by zero, result is set to first value: " + n1);
                res=n1;
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, * or /");
        }
    }
}