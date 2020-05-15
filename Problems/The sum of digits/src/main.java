import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero,  sumDig = 0;
        numero = in.nextInt();

        int aux = numero;

        while (numero != 0) {
            sumDig = sumDig + (numero % 10);
            numero = numero / 10;

        }
        System.out.println(sumDig);
    }
}