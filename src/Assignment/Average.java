package Assignment;

public class Average {
    public float Avg(int a){
        float sum=0;
        for(int i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
        float y=(sum/a);
        return(y);
    }

    public static void main(String[] args) {
        Average obj1=new Average();
        float x=obj1.Avg(100);
        System.out.println("Average="+x);
    }
}
