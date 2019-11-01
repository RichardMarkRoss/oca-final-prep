package oca.exceptions;

class MyException extends Exception {
    int id;

    MyException(int x) {
        id = x;
    }

    public String toString() {
        return "CustomException[" + id + "]";
    }
}

public class Samplee {

    private static void compute(int a) throws MyException {
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("No error in prog. no exception caught");
    }

    public static void main(String[] args) {
        try {
            compute(10);
            compute(12);
            compute(1);
        } catch(MyException ex1) {
            System.out.println(ex1.toString());
        }
    }
}