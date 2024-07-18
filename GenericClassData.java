class data<T>
{
    private T obj ;
    public void setdata(T s)
{
    obj = s;
}
public T getdata()
{
    return obj;
}
}
public class GenericClassData  {
    public static void main(String[] args) {
        data<Integer > d=new data<>();//this class can use any type of object but you have to specify it
        d.setdata(10);
        System.out.println(d.getdata() );
    }
}
