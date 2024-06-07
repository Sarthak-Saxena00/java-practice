package recursion;

public class factorial {

    public int fac(int num){
       if(num==0){
           return 1;
       }
       else{
           int ans=num*fac(num-1);
           return ans;
       }
    }


    public static void main(String[] args) {
        int number=5;
        factorial f=new factorial();
       int result= f.fac(number);
        System.out.println(result);
    }
}
