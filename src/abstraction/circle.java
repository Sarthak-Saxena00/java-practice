package abstraction;
import java.util.Scanner;
public class circle implements shape {
    @Override
    public void area() {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=s.nextInt();
        double A= Math.PI*r*r;
        System.out.println("the area is "+ A);
    }
}
