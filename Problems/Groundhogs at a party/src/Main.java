import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        boolean week = scanner.nextBoolean();
        boolean isWeekend = r >= 10 && r <= 20 && !week || r >= 15 && r <= 25 && week;
        System.out.println(isWeekend);
    }
}