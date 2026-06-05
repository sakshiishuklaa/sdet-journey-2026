
public class ArrayPractice {
    public static void main(String[] args)
    {
    int arr[]={5,2,8,1,9};
    int smol=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<smol)
        {
            smol=arr[i];
        }
    }
    System.out.println(smol);
    int l=arr.length;
    
    for(int i=0;i<l/2;i++)
    {
        int temp=arr[i];
        arr[i]=arr[l-1-i];
        arr[l-1-i]=temp;
    }
    System.out.print("Reverse array ");
    for(int i=0;i<l;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}