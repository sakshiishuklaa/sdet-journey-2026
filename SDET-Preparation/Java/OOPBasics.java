package Java;
import java.util.Scanner;

public class OOPBasics {
    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            Employee emp = new Employee();
            emp.name = sc.nextLine();
            emp.age = sc.nextInt();
            System.out.println(emp.name);
    }
}
class Employee {         
    String name;
    int age;
}

