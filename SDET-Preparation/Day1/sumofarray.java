import java.util.*;
class sumofarrray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter array elements");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}