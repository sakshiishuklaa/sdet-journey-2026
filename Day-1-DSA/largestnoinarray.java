import java.util.*;
class findlarge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={5,2,8,1,9};
        int num=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(num<arr[i])
            {
                num=arr[i];
            }
        }
        System.out.println(num);
    }
}