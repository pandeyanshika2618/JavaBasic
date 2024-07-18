class parent1
{
    public int x ;
    public parent1()
    {
        System.out.println("Non- param constructor for parent class");
    }
    public parent1(int x)
    {
        System.out.println("param constructor with value  " +x);
    }
}
class child1 extends parent1{
    public  child1() {
        System.out.println("Non param constructor for  child class");
    }
    public  child1(int x)
    {
        super(x);
        System.out.println("Param constructor for child class");

    }

}
public class Superconst {
    public static void main(String[] args) {
        child1 obj1  = new child1(20);
    }
}
