import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, num , min = 0, max = 0, total = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many numbers you will enter: ");
        n = inp.nextInt();
        for (int i = 1; i <= n; i++){

            System.out.println("Enter a number");
            num = inp.nextInt();

            total = total + num;

            if (i == 1){
                min = num;
                max = num;
            }
        if (max < num){
            max = num;
        }if (min > num){
            min = num;
            }
        }
        System.out.println("Biggest number: " + max);
        System.out.println("Smallest number: " + min);
        System.out.println("Total: " + total);
    }
}