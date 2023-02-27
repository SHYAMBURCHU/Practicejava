package Mainmethod;

import Variables.Nonstaticmethod;
import Variables.Staticmethod;

public class Runners {
    public static void main(String[] args) {
        Nonstaticmethod obj=new Nonstaticmethod();
        int q=obj.age;
        System.out.println(q);
        int r= Staticmethod.age;
        System.out.println(r);
    }
}
