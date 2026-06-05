import java.util.*;
class large
{
    public static void main(String[] args)
    {
        int a=20;
        int b=78;
        int c=34;
        if(a>b && a>c)
        {
            System.out.println(a+"is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+"is largest");
        }
        else
        {
            System.out.println(c+"is largest");
        }
    }
}