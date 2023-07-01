/*class t
{
    public static void main(String[] args)
    {
        int n = 59;
        int m = 4;
        System.out.println((float)'z');
    }

}*/

//abstract class parent{
//    float a=12,b=6,c;
//    abstract void add();
//    void sub(){
//        c=a+b;
//        System.out.println(c);
//    }
//}
//class test extends parent{
//
//    @Override
//    void add() {
//
//    }
//}

interface calc{
    void cal(int i);

}
class calculator{
    public calculator(int a){
        System.out.print(a*a);
    }
}
class calc1 extends calculator implements calc{
    int x;
    calc1(){
        super(4);
    }
    public void cal(int i){
        x=i*i;
    }
}
class test1{
    public static void main(String[] args) {
        calc1 c=new calc1();
        c.x=0;
        c.cal(2);
        System.out.print(c.x);

    }
}