import algo.LongArithmetic;

public class Main {
    public static void main(String[] args) {
        // в переменную result кладу результат сложения чисел
        char result[] = LongArithmetic.sum("1784".toCharArray(), "496".toCharArray());
        char result1[] = LongArithmetic.sub("190".toCharArray(), "19".toCharArray());
        char result2[] = LongArithmetic.multiply("1234567891".toCharArray(), "1233245453452".toCharArray());
        char result3[] = LongArithmetic.div1("63454234".toCharArray(), "2387".toCharArray());

        String asString = new String(result);
        System.out.println(asString);
        String asString1 = new String(result1);
        System.out.println(asString1);

        String asString2 = new String(result2);
        System.out.println(asString2);
        int a = 63454234, b = 2387;
        System.out.println(a/b);

        String asString3 = new String(result3);
        System.out.println(asString3);
    }
}
