package exceptionhendling;

public class ChainedException {
    public static void main(String[] args){
        String s=50+30+"Sachin"+40+40;
        System.out.println(s);

        String S11=40+50+"leon"+40+40;
        System.out.println(S11);


        StringBuffer sb=new StringBuffer("sarthak");
        sb.append("saxena");
        System.out.println(sb);

        sb.insert(7,"leo");
        System.out.println(sb);













        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

//
//         *
//        **
//       ***
//      ****
//     *****
//

        for(int i=1;i<=5;i++){
            for(int sp=5-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println();
        System.out.println();
        System.out.println();

//        *****
//         ****
//          ***
//           **
//            *

        int n=5;
        for(int i=n;i>=1;i--){
            for(int sp=n-i;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
