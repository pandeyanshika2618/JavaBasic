import java.sql.SQLOutput;
import java.util.LinkedList;

class MyQueue<T> {
    LinkedList<T> MyQ = new LinkedList<>();
    int maximum_limit ;
  public   MyQueue (int  maximum_limit)
    {
         this.maximum_limit = maximum_limit;
    }

    public void push(T a)

    {
        checkLimit();
        MyQ.offer(a);
    }
    public void peek () {
        System.out.println(MyQ.peek());
    }
    public void pop()
    {
        checkLimit();
        System.out.println(MyQ.poll());
    }
    public void Last()
    {
        System.out.println(MyQ.getLast());
    }

    public void display()

    {
        for( T x:MyQ)
        {
            System.out.println(x);
        }
    }
    public void  checkLimit () {
        if (MyQ.size() > maximum_limit) {
            System.out.println("Queue size exceeded maximum leval");

        }
        if (MyQ.size() <= 0)
        {
            System.out.println("We can dequeue any element , Queue is empty");
    }
}
//    public void pop ()
//    {
//
//    }
}
public class Queue1 {

    public static void main(String[] args) {
        MyQueue<Integer> myqueue = new MyQueue<>(10);
        myqueue.push(10);
        myqueue.push(11);
        myqueue.push(12);
        myqueue.push(15);
        myqueue.push(16);
        System.out.println("The elements of the queue is:");
        myqueue.display();
        System.out.println("The element at the peek");
        myqueue.peek();
        System.out.println("The poped element is ");
        myqueue.pop();
        System.out.println("The element in the last of queue");
        myqueue.Last();
    }
}

