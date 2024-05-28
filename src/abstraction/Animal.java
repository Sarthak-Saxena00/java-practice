package abstraction;

abstract public class Animal {
    public void Nature(int I){
        if(I==1){
            System.out.println("domestic animal");
        }else {
            System.out.println("wild animal");
        }

    }
   abstract public void Sound();
}
