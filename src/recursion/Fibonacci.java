package recursion;

public class Fibonacci {

    public int fib(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        else{
            int fn=fib(n-1)+fib(n-2);
                    return fn;
        }
    }
    public static void main(String[] args) {
        int position=10;
        Fibonacci f=new Fibonacci();

        for(int i=0;i<=position;i++){
            int ans=f.fib(i);
            System.out.print(ans+" ");
        }

    }
}
