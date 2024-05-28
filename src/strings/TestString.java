package strings;

public class TestString {
    public static void main(String[] args){
        System.out.println("this is where i'll test strings");//       String s1="sarthak";
//        System.out.println(s1);
//        String s2="sarthak";
//        System.out.println("s1==s2 is ---" + s1==s2);
//        System.out.println("the s1's hash is "+s1.hashCode());
//        System.out.println("the s2's hash is "+s2.hashCode());
//
//
//        String s3=new String("sarthak");
//        String s4= new String("sarthak");
//        System.out.println(s4==s3);
//        System.out.println(s4.equals(s3));


        String s1=new String("sarthak");
        String s2=new String("sarthak");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        employee e1=new employee();
        e1.setId(10);
        e1.setName("ram");


        employee e2 =new employee();
        e2.setId(10);
        e2.setName("ram");

        System.out.println("using ==  "+ (e1==e2));
        System.out.println("using equals method  "+ e1.equals(e2));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}
