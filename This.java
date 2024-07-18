
class parent11
{
    public parent11()
    {
        System.out.println("Parents' constructor");
    }
    public void display()
    {
        System.out.println("Method of parent class");
    }
}
class child11 extends parent11
{
    public child11()
    {
        System.out.println("child constructor");
    }
    public void display()
    {

        System.out.println("method of child class");
    }
}
class Grandchild11 extends child11
{
    public Grandchild11 ()
    {
        System.out.println("grandchild's constructor");
    }
}
class This
{
    public static void main(String[] args) {
        parent11 obj = new child11();//possible because of polymorphism
        obj.display();
    }
}