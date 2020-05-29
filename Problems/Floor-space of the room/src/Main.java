import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String figure = in.nextLine();
        double a,b,c,r, resultado, peri, peri2, resultado2;

        switch (figure) {
            case "triangle":
                a = in.nextDouble();
                b = in.nextDouble();
                c = in.nextDouble();
                peri = a+b+c;
                peri2 = peri / 2;

                resultado = peri2 * ((peri2 - a) * (peri2 - b) * (peri2 - c));
                resultado2 = Math.sqrt(resultado);
                System.out.println(resultado2);
                break;
            case "rectangle":
                a = in.nextDouble();
                b = in.nextDouble();
                resultado = a*b;
                System.out.println(resultado);
                break;
            case "circle":
                r = in.nextDouble();
                resultado = r*r;
                System.out.println(3.14 * resultado);
                break;
        }
    }
}
