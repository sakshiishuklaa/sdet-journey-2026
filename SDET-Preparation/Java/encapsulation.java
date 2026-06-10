import java.util.*;
public class encapsulation
{   
    private int age;
    private String name;
    public void setage(int age)
    {
        this.age=age;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }


   
        public static void main(String[] args)
    {
        encapsulation s=new encapsulation();
        s.setage(23);
        s.setname("Sakshi");
        System.out.println(s.getage());
        System.out.println(s.getname());
    }
    }
