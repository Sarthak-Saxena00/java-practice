package exceptionhendling;

public class MethodsToPrintException {
    public static void main(String[] args){
        //1- PrintStackTrace
        // name of exception and description of exception.
//     try{
//         System.out.println(10/0);
//     }
//     catch(Exception e){
//         e.printStackTrace();
//        System.out.println(e);
//     }
//        System.out.println("code ends");
//        System.out.println(10+20);



        //2-toString():- gives only the error name.
        //3-getMessage():- it only gives the description
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
       }
        System.out.println("code ends 2nd time");
        System.out.println(10+20+30);


    }
}

// all these methods are present in throwable class
