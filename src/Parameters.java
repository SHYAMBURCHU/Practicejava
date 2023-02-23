public class Parameters {
    public int add(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public int multiply(int c,int d)
    {
        int f=c*d;
        return f;
    }

    public static void main(String[] args) {
        Parameters obj=new Parameters();
        int d= obj.add(675,5678);
        int g= obj.multiply(267,768);
        System.out.println(d);
        System.out.println(g);
    }
}
