package DSA;
import java.util.Scanner;

public class countvowels {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String st1=sc.nextLine();
        String st=st1.toLowerCase();
        int count=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
