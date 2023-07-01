public class StringType
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java"); //mutable string
        sb.append("script");
        System.out.println(sb);//javascript
        String str = "html";
        str.concat("css");
        System.out.println(str);//html
        String s1 = "java";
        String s2 = "script";
        String s3 = s1+s2;
        String s4 = s1+"script";
        String s5 = "java"+"script";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
