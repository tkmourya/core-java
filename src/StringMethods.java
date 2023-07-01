
public class StringMethods
{
    public static void main(String[] args) {
        String s = "Kodnest tech";
        System.out.println(s.length());//12
        System.out.println(s.charAt(5));//s
        System.out.println(s.indexOf('d'));//2
        System.out.println(s.contains("nest"));//true
        System.out.println(s.substring(3,7));//nest
        System.out.println(s.substring(8));//tech

    }
}
