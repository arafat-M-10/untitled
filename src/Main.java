import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//String[] args
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        double r = scanner.nextInt();
        int n = scanner.nextInt();

        double base = (1 + (r/100));
        double result = Math.pow(base, n);
        double total = s * result;

        System.out.printf("Final stength score after %d months : %.2f",n,total);


        scanner.close();
    }