package Runner_class;

import PACKAGE_CONDITIONALS.Conditional_statements;
import PACKAGE_CONDITIONALS.If_statement;
import PACKAGE_CONDITIONALS.Ifelse_;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Conditional_statements obj= new Conditional_statements();
        int d= obj.add(10,20);
        System.out.println(d);
        If_statement obj1=new If_statement();
        int e=obj1.even_odd();
        System.out.println(e);
        Ifelse_ obj2=new Ifelse_();
        int q=obj2.marks();
        System.out.println(q);
    }

}
