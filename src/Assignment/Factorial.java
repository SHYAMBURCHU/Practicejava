package Assignment;

public class Factorial {
    public int Fact(int a){
        int fact=1;
        while(a!=0){
            fact=fact*a;
            a--;
        }
        return(fact);
    }

    public static void main(String[] args) {
        Factorial obj2=new Factorial();
        int Factorial_Result=obj2.Fact(10);
        System.out.println("Factorial="+Factorial_Result);
    }
}
