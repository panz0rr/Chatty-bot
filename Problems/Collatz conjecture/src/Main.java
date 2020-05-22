import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = sc.nextInt();

        while(flag){
            if (n==1){
                flag = false;
            }
            System.out.print(n + " ");
            if (n % 2 ==0) {
                n = n/2;
            } else {
                 n = n*3+1;
            }

        }


    }
}