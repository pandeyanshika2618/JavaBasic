
class parent
{
    public parent()
    {
        System.out.println("Parents' constructor");
    }
}
class child extends parent
{
    public child()
    {
        System.out.println("child constructor");
    }
}
class Grandchild extends child
{
    public Grandchild ()
    {
        System.out.println("grandchild's constructo");
    }
}
 class inheritence2
{
    public static void main(String[] args) {
        Grandchild obj = new Grandchild();
    }
}