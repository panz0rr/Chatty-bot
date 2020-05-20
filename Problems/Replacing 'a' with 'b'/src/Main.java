import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        a = a.replace('a', 'b');
        System.out.println(a);

    }
}