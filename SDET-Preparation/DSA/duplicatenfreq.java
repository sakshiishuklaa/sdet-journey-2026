package DSA;
import java.util.*;
class duplicatenfreq
{
    public static void main(String[] args)
    {
        //Find duplicate characters.
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
        char ch = s.charAt(i);
        int count=0;
        boolean r=true;
        for(int j=0;j<l;j++)
        {
            if(s.charAt(j)==ch)
            {
                count++;
                
            }
        }
        if(count>1)
        {
            boolean a=false;
            for(int k=0;k<i;k++)
            {
                if(s.charAt(k)==s.charAt(i))
                {
                    a=true;
                    break;
                }
            }
            if(!a)
            {
            System.out.println(ch);
            }
        }
        }

        //Count frequency of every character.
        String p=sc.nextLine();
        int len=p.length();
        for(int k=0;k<len;k++)
        {
            int freq=0;
            char ch=p.charAt(k);
        for(int i =0;i<len;i++)
        {   
            
            if(p.charAt(i)==ch)
            {
                freq++;
            }

        }
        System.out.println("Frequency of"+p.charAt(k)+"= "+freq);
    }
    

    }
}