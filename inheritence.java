public class inheritence {
    public double radius ;
        public double area ()
        {
        return Math.PI * radius * radius;
        }
        public double perimeter ()
        {
            return 2*Math.PI*radius;
        }
        public double circumreference()
        {
            return perimeter();
        }
      }
    class cylinder extends inheritence{

     public double height ;
       public double volume()
       {
         return area()*height;
        }
}
      class circle1
   {
       public static void main(String[] args) {
           cylinder c = new cylinder();
           c.radius = 7 ;
           c.height  = 10 ;
           System.out.println("volume" +c.volume());
           System.out.println("Area" +c.area());
       }
   }
