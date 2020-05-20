import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine().toUpperCase();
        boolean ab = a.startsWith("J");
        System.out.println(ab);
    }
}