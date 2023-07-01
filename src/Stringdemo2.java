public class Stringdemo2
{
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        if(s1==s2) //Address compare ex-1000=1000=? ->same
        {
            System.out.println("Addresses are same");
        }
        else{
            System.out.println("Addresses are not same");
        }
        if(s1.equals(s2))// values compare ex- java=java=? ->same
        {
            System.out.println("values are same");
        }
        else{
            System.out.println("values are not same");
        }
    }
}
