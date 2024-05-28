package collections;

import java.util.Collections;

public class TestCustomGeneric {
    public static void main(String[] args) {
       // Collections c=new CustomGeneric<>();
        CustomGeneric<String,Integer> custom=new CustomGeneric<>();
        custom.setX("sarthak");
        System.out.println(custom.getX());
        custom.setY(25);
        System.out.println(custom.getY());
    }
}
