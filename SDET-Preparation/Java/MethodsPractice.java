class MethodsPractice
{
public static int add(int a, int b)
{
 int d=a+b;
 return d;
}
public static boolean isEven(int num)
{
    if(num%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static int findMax(int a, int b)
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}
public static void main(String[] args)
{
    int sum= add(6,7);
    System.out.println(sum);
    System.out.println(isEven(21));
    System.out.println(findMax(84,34));
}
}