import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double count = 0;
        double sum = 0;

        for (double i = a; i<=b; i++) {
            if (i % 3 == 0) {
                count += 1;
                sum += i;
            }
        }

        double result = sum / count;
        System.out.println(result);
            }

        }

