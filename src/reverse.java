import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int rev=0;
        while (a!=0){
            int last=a%10;
            rev=rev*10+last;

            a=a/10;
        }
        System.out.println(rev);
    }
}
