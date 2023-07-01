public class Stringdemo1
{
    public static void main(String[] args) {
        String s1 =new String("java");
        String s2 =new String("java");
        if(s1==s2) //Address compare ex-1000=2000=? ->not same
        {
            System.out.println("Addresses are same");
        }
        else {
            System.out.println("Addresses are not same");
        }
        if(s1.equals(s2))// values compare ex- java=java=?->same
        {
            System.out.println("values are same");
        }
        else {
            System.out.println("values are not same");
        }
    }
}
