package Assignment;

public class Fibonacci {
    public void fibonacci(int a){
       int sum=1;
        System.out.println(sum);
        int Previous=0;
        int Present=1;
        for(int i=1;i<=a;i++)
        {
            sum=Previous+Present;
            System.out.println(sum);
            Previous=Present;
            Present=sum;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        obj.fibonacci(10);
    }
}
