import java.util.Scanner;
public class Nikhil
{
    int age;
    String name;
    
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public static void main(String[] args)
    {
        Nikhil n=new Nikhil();
        //n-> reference variable
        n.setName("Nikhil Soni");
        n.setAge(21);
        
        System.out.println(n.getName()+" "+n.getAge());
    }
}