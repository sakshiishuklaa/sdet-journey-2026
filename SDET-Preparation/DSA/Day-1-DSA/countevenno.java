import java.util.*;
class count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6};
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}