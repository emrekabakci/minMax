
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //New scanner created.
        Scanner x=new Scanner(System.in);

        //Variables defined.
        int n;
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //Data retrieved from user.
        System.out.print("How many numbers will be entered : ");
        n=x.nextInt();

        //Min and max calculated here.
        for(int i=1;i<=n;i++) {
            System.out.print(i + ". Enter Number : ");
            num = x.nextInt();
            if(num>max) {

                max=num;
                if (i==1){
                    min=num;
                }else if (num < min){
                    min=num;
                }
            }

        }

        //Results printed.
        System.out.println("The greatest value is : "+max);
        System.out.println("The smallest value is: "+min);
    }
}