package Java;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = "automation";
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1,5));
        String st="rich";
        if(str.contains(st))
        {
            System.out.println("It's a great day");
        }
        else
        {
            System.out.println("It's a great night");
        }
        System.out.println(str.replace(str.substring(1,5), st));
        System.out.println(str.trim());
    }
}
