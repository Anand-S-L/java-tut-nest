import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=s.nextInt();
        System.out.println("Enter 2nd number");
        int b=s.nextInt();
        System.out.println("Enter 3rd number");
        int c=s.nextInt();
        int largest=0;
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);
        }
        else if(c>=a && c>=b){
            System.out.println(c);
        }
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

    }
}
