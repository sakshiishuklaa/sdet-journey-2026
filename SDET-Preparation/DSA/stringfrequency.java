package DSA;
import java.util.Scanner;

public class stringfrequency {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);  
        //count words
        System.out.println("enter string");
        String st=sc.nextLine();
        
        int count=0;
        boolean val=false;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)!=' ' && !val)  
            {
                count++;
                val=true;
            }
            else if(st.charAt(i)==' ')
            {
                val=false;
            }        
        }
        System.out.println(count);

        //Find frequency of character

        System.out.println("enter string");    
        String st=sc.nextLine();
        int l=st.length();
        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        int c=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)==(ch))
            {
                c++;
            }
        }
        System.out.println("Frequency = " + c);






    }
    
}
