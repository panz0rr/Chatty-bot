import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int piezas = in.nextInt();
        int numero = 0;
        int l = 0;
        int s = 0;
        int p = 0;

        for (int i = 0; i<piezas; i++) {
            numero = in.nextInt();
            if (numero == 1) {
                l = l +1;
            } else if ( numero == -1) {
                s = s +1;
            }else if (numero ==0) {
                p = p + 1;
            }
        }
        System.out.print(p + " " + l + " " + s);



}
}