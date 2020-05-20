import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean a = (number > 0) && (number < 10);
        System.out.println(a);

    }
}