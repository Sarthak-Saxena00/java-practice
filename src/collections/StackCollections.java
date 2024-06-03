package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackCollections {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=10;i++){
            st.push(i);
        }
        System.out.println("original Stack is ---->"+st);

       st.pop();//pop outs the top element
       st.push(50);//push on top
        System.out.println("the peak of the stack is--->"+st.peek()) ;
     int offset=   st.search(5);

        System.out.println("the offset of object 5 is---->"+offset);
        System.out.println("after operations Stack is ---->"+st);
        int n=st.size();
        Iterator<Integer> it= st.iterator();
        for(int i=1;i<=n;i++){
            System.out.println(it.next());
        }
    }
}
