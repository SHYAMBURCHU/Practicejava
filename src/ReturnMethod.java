public class ReturnMethod {
    public int sub()
    {
        int a=300;
        int b=200;
        int c=a-b;
        return(c);
    }
    public int add()
    {
        int a=120;
        int b=130;
        int c=a+b;
        return(c);
    }

    public static void main(String[] args) {
        ReturnMethod obj=new ReturnMethod();
       int d= obj.sub();
       int e= obj.add();
       System.out.println(d);
       System.out.println(e);
    }
}
