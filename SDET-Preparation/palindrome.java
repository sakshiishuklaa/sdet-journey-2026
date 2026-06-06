import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String st=sc.nextLine();
        String rev="";
        int l=st.length();
        for(int i=l-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }
        if(rev.equals(st))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome "+rev);
        }
    }
}
