package encapsulation;

public class rectangle {
    private int length;
    private int width;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        System.out.println("the length is "+length);
        return length;

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        System.out.println("the length is "+width);
        return width;
    }

    public void CalculateArea(){
        int area=length*width;
        System.out.println("the area is "+area);
    }
}
