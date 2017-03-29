package ru.ivmiit.generics.methods;

/**
 * 27.02.2017
 * Program
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program {

    public static <T> void method(T x, T y) {
        System.out.println(x);
        System.out.println(y);
    }

    public static <T, E> void method2(T x, E y) {
        System.out.println(x);
        System.out.println(y);
    }

    public static <T extends A> void method3(T x, T y) {
        System.out.println(x.getValue());
        System.out.println(y.getValue());
    }

    public static <T> T method4(T x) {
        return x;
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();

        B b = new B();
        B b2 = new B();

        method(a, a2);
        method(b, b2);
        method(b2, a);
        method2(b2, a);
        method2(a, 2);

        method3(a, a2);
        // method3(b, b2);

        A someA = method4(a);
        B someB = method4(b);
        // someB = method4(someA);
    }
}
