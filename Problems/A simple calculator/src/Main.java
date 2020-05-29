import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long val1 = sc.nextLong();
        long val2;
        String operation = sc.next();

        switch (operation){
            case "+":
                val2 = sc.nextLong();
                System.out.println(val1+val2);
                break;
            case "-":
                val2 = sc.nextLong();
                System.out.println(val1-val2);
                break;
            case "/":
                val2 = sc.nextLong();
                if (val2 == 0){
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(val1/val2);
                }
                break;
            case "*":
                val2 = sc.nextLong();
                System.out.println(val1*val2);
                break;
            default:
                System.out.println("Unknown operator");
                break;

         }

        }
    }
