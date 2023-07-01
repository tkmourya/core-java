package com.practise_opps;

import java.util.Scanner;

public class CounterApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a String");
        String st = s.nextLine();
        char[] ch = st.toCharArray();
        int v=0, c=0, d=0, o=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z')
            {
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='u'||ch[i]=='i'||ch[i]=='o'){
                    v++;
                }
                else{
                    c++;
                }
            } else if (ch[i]>='0' && ch[i]<='9') {
                d++;
            }
            else{
                o++;
            }
        }
        System.out.println("V="+v);
        System.out.println("D="+d);
        System.out.println("C="+c);
        System.out.println("O="+o);
    }
}
