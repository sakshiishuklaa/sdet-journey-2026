package DSA;

import java.util.Scanner;

public class stringproblems4 {
    
    public static void main(String[] args)
    {
    // Find first non-repeating character.
    Scanner sc=new Scanner(System.in);
    String st=sc.nextLine();
    int count;
    for(int i=0;i<st.length();i++)
    {   
        count=0;
        for(int j=0;j<st.length();j++)
        {
        if(st.charAt(i)==st.charAt(j))
        {
            count++;
        }
        }
    if(count==1)
    {
        System.out.println("Find first non-repeating character."+st.charAt(i));
        break;
    }
    }
}

//Check if two strings are equal without using .equals().
String a=sc.nextLine();
String b=sc.nextLine();
int count=0;
if(a.length()==b.length())
{
    for(int i=0;i<a.length();i++)
    {
        if(a.charAt(i)==b.charAt(i))
        {
            count++;
        }
    }
}
if(a.length()==count)
{
System.out.println("strings are equal");
}
else
{
    System.out.println("strings are not equal");
}
}

}