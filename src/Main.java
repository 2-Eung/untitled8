import java.util.Scanner;

public class Main {
    public static double inputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    public static char inputChar() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    public static void main(String[] args) {
        double a = inputNumber();
        char A = inputChar();
        double b = inputNumber();

        double res= 0 ;

        switch (A) {
            case '+' : res = a + b; break;
            case '-' : res = a - b; break;
            case '*' : res = a * b; break;
            case '/' : res = a / b; break;
            default : return;
        }
        System.out.println(res);
    }
}