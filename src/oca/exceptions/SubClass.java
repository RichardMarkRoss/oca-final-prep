package oca.exceptions;

import java.io.IOException;
interface KingClass{
    void method() throws IOException;

}
abstract class SuperClass implements KingClass {
    @Override
    public void method() throws IOException
    {
        System.out.println("SuperClass");
    }

    abstract void dump(String s ) throws IOException;
}

class ExtendedClass extends SuperClass{
    @Override
    public void method() throws IOException {
        System.out.println("extended class");
    }

    @Override
    void dump(String s){
        System.out.println(s);
    }
}
public class SubClass extends ExtendedClass {
    public void method() throws IOException {
        System.out.println("SubClass");
    }
    public static void main(String args[]){
        SuperClass s = new SubClass();
        SuperClass m = new SuperClass() {
            @Override
            void dump(String s) {

            }
        };
        SuperClass  k= new ExtendedClass();
        SubClass r = new SubClass();
        ExtendedClass v = new ExtendedClass();
        try {
            s.dump("Richard");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}