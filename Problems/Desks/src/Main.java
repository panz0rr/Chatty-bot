import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int module = (num1+1)/2;
        int module2 = (num2+1)/2;
        int module3 = (num3+1)/2;
        int mesas = (module+module2+module3);
        System.out.println(mesas);

    }
}