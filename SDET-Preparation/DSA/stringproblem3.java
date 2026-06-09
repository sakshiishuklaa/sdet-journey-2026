import java.util.Scanner;

public class stringproblem3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //count digits in a string
        System.out.println("enter string");
        String st=sc.nextLine();
        int l=st.length();
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(st.charAt(i)=='1'||st.charAt(i)=='2'||st.charAt(i)=='3'||st.charAt(i)=='4'||st.charAt(i)=='5'||st.charAt(i)=='6'||st.charAt(i)=='7'||st.charAt(i)=='8'||st.charAt(i)=='9'||st.charAt(i)=='0')
            {
                count++;
            }
            // if (Character.isDigit(str.charAt(i))) {
            //     count++;
            // }//we can use this function directly to check 0-9
        }
        System.out.println(count);
        
        //remove spaces from string 

        System.out.println("enter string");
        String st1=sc.nextLine();
        String st2="";
        for(int i=0;i<st1.length();i++)
        {
            if(st1.charAt(i)!=' ')
            {
                st2=st2+st1.charAt(i);
            }
            
        }      
        System.out.println(st2);  
    }

}
