public class Return
{
    public int add()
    {
        int a=56;
        int b=47;
        int c=a+b;
        return(c);
    }
    public static void main(String[] args) {
        Return obj=new Return();
        int s=obj.add();
        System.out.println(s);
    }
}
