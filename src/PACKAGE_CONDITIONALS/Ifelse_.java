package PACKAGE_CONDITIONALS;

public class Ifelse_ {
    public int marks(){
        int sub1=20;
        if (sub1<5)
        {
            System.out.println("fail");
        }
        if (sub1 >= 5 && sub1 < 15) {
            System.out.println("just_pass");

        }
        else {
            System.out.println("pass");
        }
        return(sub1);
    }
}
