public class StringBuffer1 {
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Pandey");
        System.out.println(sb);
       // String str = sb;  wrong (Mistype)
        String str = sb.toString();
    }
}
