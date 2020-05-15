import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int resultado = ((n + 1) * n  + 2) * n + 3;
        System.out.println(resultado);
    }
}