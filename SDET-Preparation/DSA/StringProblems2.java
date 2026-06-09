package DSA;
import java.util.Scanner;

public class StringProblems2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        int c=0;
        String st=st1.toLowerCase();
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)!='a'&& st.charAt(i)!='e'&& st.charAt(i)!='i'&& st.charAt(i)!='o'&& st.charAt(i)!='u')
            {
                c++;
            }
        }
        System.out.println(c);
        

        //anagram sol

        String st1="aab";
        String st2="abb";
        int a=st1.length();
        int b=st2.length();
        boolean[] visited = new boolean[st2.length()];
        int count=0;
        if(a==b)
        {       
            for(int i=0;i<a;i++)
            {   
                for(int j=0;j<b;j++)
                {
                    if(!visited[j] && st1.charAt(i)==(st2.charAt(j)))
                    {
                        visited[j]=true;
                        count++;
                        break;
                    }
                }
            }
        }
        if(count==a)
        {
            System.out.println("anagram");
        }
        else
        {
            System.out.println("not anagram");
        }


    }
}
