public class Nestedclass {
    void show() {
        System.out.println("outside");
    }
        class insidenested
        {
            void display()
            {
                System.out.println("inside nested");
            }
        }
        public static void main(String[] args)
        {
            Nestedclass obj = new Nestedclass();
            obj.show();
            Nestedclass.insidenested obj1 = obj.new insidenested();
            obj1.display() ;
        }
    }

