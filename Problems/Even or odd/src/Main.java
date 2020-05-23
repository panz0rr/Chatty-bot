import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        boolean flag = true;

        while (flag){
            a = sc.nextInt();

            if(a%2==0 && a !=0) {
                System.out.println("even");
            } if (a == 0) {
                flag = false;
            } if (a%2!=0){
                System.out.println("odd");
            }
        }
    }
}