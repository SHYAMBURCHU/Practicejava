package Assignment;

public class greatest {
    public int big(int a,int b,int c){
        if(a<b){
            if(b<c){
                return(c);
            }
            else{
                return(b);
            }
        }
        else{
            if(a<c){
                return(c);
            }
            else{
                return(a);
            }
        }
    }

    public static void main(String[] args) {
        greatest obj=new greatest();
       int x=obj.big(30,10,20);
        System.out.println(x);

    }
}
