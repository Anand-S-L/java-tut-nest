import java.util.Scanner;

public class NestDigital {
    String name;
    String code;
    String designation;
    int salary;
    public static void main(String[] args) {
    NestDigital ob=new NestDigital();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name");
    ob.name=s.nextLine();
        System.out.println("Enter code");
    ob.code=s.nextLine();
        System.out.println("Enter designation");
    ob.designation=s.nextLine();
        System.out.println("Enter Salary");
    ob.salary=s.nextInt();

        System.out.println(ob.name);
        System.out.println(ob.code);
        System.out.println(ob.designation);
        if(ob.salary>20000)
        System.out.println("trainee");

    }
}
