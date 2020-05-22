import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int elem = 0;
        while (flag) {
            int num = sc.nextInt();
            if (num > 0 && num > elem) {
                elem = num ;
            } else if (num == 0){
                flag = false;
            }
        }
        System.out.println(elem);

    }
}