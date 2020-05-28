import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int sum = 0;


            for (int i = 0; i < 1000; i++) {
                int a = sc.nextInt();
                    sum += a;
                if (a == 0) {
                    System.out.println(sum);
                    break;
                } else if (sum >= 1000){
                    System.out.println(sum - 1000);
                    break;
                }
        }
    }
}


