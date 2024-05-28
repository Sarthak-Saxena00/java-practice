package abstraction;
import java.util.Scanner;
public class square implements shape {
    Scanner s = new Scanner(System.in);
    @Override
    public void area() {
        System.out.println("enter the side");
        int side=s.nextInt();
        int A= side*side;
        System.out.println("the area of square is"+A);
    }
}
