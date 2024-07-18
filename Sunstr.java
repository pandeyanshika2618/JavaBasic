 abstract   class Sunstr {
    Sunstr()
    {
        System.out.println("Constructor of the abstract class");
    }
   abstract public void meth1();

}
class done extends Sunstr
{
     public void meth1()
    {
        System.out.println("helloo");
    }
}
 class Main {

     public static void main(String[] args) {
         Sunstr s  = new done();
     }


     }