import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String city = in.nextLine();
        boolean endsWith = city.endsWith("burg");
        System.out.println(endsWith);


    }
}