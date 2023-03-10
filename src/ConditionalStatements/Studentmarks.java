package ConditionalStatements;

public class Studentmarks
{
    public int Studentmarks()
    {
        int r=98;
        if(r<35)
        {
            System.out.println("fail");
        }
        else if (r==35)
        {
            System.out.println("just pass");
        }
        else if (r>35 && r<65)
        {
            System.out.println("third class");
        }
        else if (r>65 && r<75)
        {
            System.out.println("second class");
        }
        else if (r<75 && r<85)
        {
            System.out.println("first class");
        }
         else if (r<=100)
         {
             System.out.println("distinction");
    }
         return r;
    }
}

