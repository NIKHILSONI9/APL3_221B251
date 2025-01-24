
public class Main
{
     public static void main(String args[]) {
       
        Mother m = new Mother();
        m.show(); 
        
        Child ch = new Child();
        ch.show(); 

        Mother polymorphicRef = new Child();
        polymorphicRef.show(); 
    }
}



   
