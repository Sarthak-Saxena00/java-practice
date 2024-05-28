package collections;

public class CustomGeneric <Cg, Scg> {
   private Cg x;
   private Scg y;

    public Scg getY() {
        return y;
    }

    public void setY(Scg y) {
        this.y = y;
    }

    public void setX(Cg x) {
        this.x = x;
    }

    public Cg getX() {
        return x;
    }
}
