import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        boolean a = (number1 != number2) && (number2 != number3) && (number1 != number3);
        System.out.println(a);
    }
}