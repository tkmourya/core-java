package com.practise_opps;

import java.util.Scanner;
class TCenterApp{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
//        String coreJava = s.nextLine();
//        String manualTesting = s.nextLine();
//        String aptitute = s.nextLine();
//        String softSkill = s.nextLine();
        KodNest KN = new KodNest();
        KN.coreJava();
        KN.manualTesting();
        KN.aptitude();
        KN.softSkill();

    }
}
public class TCenter {
//    TCenter()
//    {
//        Scanner st = new Scanner(System.in);
//        System.out.println("Please entre subjects name");
//        String cj = st.nextLine();
//        String mt = st.nextLine();
//        String ap = st.nextLine();
//        String ss = st.nextLine();
//    }
    public void coreJava(){
        Scanner st = new Scanner(System.in);

        System.out.println("Please entre subject 1 name");
        String co = st.nextLine();
        System.out.println(co);
        System.out.println("teaching by deep sir");
        System.out.println("----------------------------");
    }
    public void manualTesting(){
       // Scanner st = new Scanner(System.in);
       // System.out.println("Please entre subject 2 name");
       // String co = st.nextLine();
        System.out.println("--ManualTesting--");
        System.out.println("teaching by yasha sir");
        System.out.println("----------------------------");
    }
    public void aptitude(){
//        Scanner st = new Scanner(System.in);
//        System.out.println("Please entre subject 3 name");
//        String co = st.nextLine();
        System.out.println("--Aptitude--");
        System.out.println("teaching by ** sir");
        System.out.println("----------------------------");
    }
    public void softSkill(){
//        Scanner st = new Scanner(System.in);
//        System.out.println("Please entre subject 4 name");
//        String co = st.nextLine();
        System.out.println("--softSkill--");
        System.out.println("teaching by prabha karan sir");
        System.out.println("----------------------------");
    }
}
class KodNest extends TCenter{

}

//class TCenterApp{
//    public static void main(String[] args) {
//        KodNest KN = new KodNest();
//        KN.coreJava();
//        KN.manualTesting();
//        KN.aptitude();
//        KN.softSkill();
//    }
//}
