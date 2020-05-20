import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean eq1 = a <= 0 && b <= 0 && c > 0;
        boolean eq2 = a <= 0 && b > 0 && c <= 0;
        boolean eq3 = a > 0 && b <= 0 && c <= 0;

        System.out.println(eq1 || eq2 || eq3);
    }
}