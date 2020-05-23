import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b = 0;

        while (N > b) {
            b++;
            int m = b * b;
            if (N < m) {

                break;
            }
            System.out.println(m);
        }
    }
}
