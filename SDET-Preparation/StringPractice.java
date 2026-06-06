import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name = "Sakshi";
        int l=name.length();
        String st=name.toUpperCase();
        String st1=name.toLowerCase();
        String st2="Shukla";
        System.out.println(st);
        System.out.println(st1);
        System.out.println(name.equals(st2));
        String sum="";
        for(int i=l-1;i>=0;i--)
        {
            sum=sum+name.charAt(i);
        }
        System.out.println(sum);
    }
}
