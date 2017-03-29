package exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {

    // StackOverflowError
    public static int rec(int n) {
        return rec(n - 1);
    }

    // OutOfMemoryError
    public static Object[] createObject() {
        Object objects[] = new Object[Integer.MAX_VALUE];
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            objects[i] = new String("qwertyuiopasdfghjklzxcvbnm,");
        }
        return objects;
    }

    public static void main(String[] args) {
//         example of Checked Exception
//         InputStream stream = new FileInputStream("hello.txt");
//        rec(21);
//        createObject();
//        B b = new B();
    }
}
