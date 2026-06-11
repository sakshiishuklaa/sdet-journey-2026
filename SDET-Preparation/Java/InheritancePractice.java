class Vehicle
{
    String brand="Hyundai";
    void start()
    {
        System.out.println("Car Started");
    }
}
class Car extends Vehicle
{   
    String model="creta";
    void display()
    {
        System.out.println("Brand: " + brand);
        start();
        System.out.println("Model: " + model);
    }

}

public class InheritancePractice{
public static void main(String[] args)
{
    Car c=new Car();
    c.display();

}
}