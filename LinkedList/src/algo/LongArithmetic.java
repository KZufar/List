package algo;

import static algo.LongArithmeticUtils.*;

public class LongArithmetic {
    public static char[] sum(char[] a, char[] b) {
        // переворачиваем два числа
        reverse(a);
        reverse(b);

        // вычисляем длину макисмального
        int maxLength = Math.max(a.length, b.length);

        // если первое число не максимальное по длине
        // меняем их местами
        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        // здесь храним результат, он всегда может быть на 1-ну цифру больше
        char result[] = new char[maxLength + 1];

        // здесь храним разряд для переноса
        int forTransfer = 0;

        // бежим по максмальному числу
        for (int i = 0; i < maxLength; i++) {
            // забираем числовое представление символа
            int aValue = fromCharDigit(a[i]);


            int bValue;
            // если второе число кончилось
            if (i > b.length - 1) {
                // ставим нолик
                bValue = 0;
            } else {
                // в противном случае забираем числовое представление символа
                bValue = fromCharDigit(b[i]);
            }

            // резлультат сложения двух чисел на одинаковых разрядах
            int sumValues = aValue + bValue + forTransfer;

            // если резльутат превысел 10
            if (sumValues >= 10) {
                forTransfer = 1;
                sumValues = sumValues - 10;
            } else {
                forTransfer = 0;
            }

            result[i] = toCharDigit(sumValues);
        }

        // в конце программы если остался остаток
        if (forTransfer > 0) {
            result[result.length - 1] = toCharDigit(forTransfer);
        }

        reverse(result);
        return prepareToReturn(result);
    }

    public static char[] sub(char[] a, char[] b) {

        reverse(a);
        reverse(b);

        int maxLength = Math.max(a.length, b.length);

        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

//        for(int i = 0; i < maxLength; i++){
//            for(int j = 0; j < maxLength; j++){
//                if(fromCharDigit(a[i]) < fromCharDigit(b[i])){
//                    char temp[] = new char[maxLength];
//                    temp = b;
//                    b = a;
//                    a = temp;
//                }
//            }
//        }
        char result[] = new char[maxLength];


        for (int i = 0; i < maxLength; i++) {

            int aValue = fromCharDigit(a[i]);

            int bValue;

            if (i > b.length - 1) {
                bValue = 0;
            } else {
                bValue = fromCharDigit(b[i]);
            }
            int n = 0;

            if (aValue < bValue) {
                aValue = aValue + 10;

                while (fromCharDigit(a[i + 1 + n]) == 0) {
                    a[i + 1 + n] = toCharDigit(9);
                    n++;
                }
                a[i + 1 + n] = toCharDigit(fromCharDigit(a[i + 1 + n]) - 1);
            }


            int subValues = aValue - bValue;


            result[i] = toCharDigit(subValues);
        }


        reverse(result);
        return prepareToReturn1(result);
    }

    public static char[] sub1(char[] a, char[] b) {


        int maxLength = Math.max(a.length, b.length);

        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        char result[] = new char[maxLength];


        for (int i = 0; i < maxLength; i++) {

            int aValue = fromCharDigit(a[i]);

            int bValue;

            if (i > b.length - 1) {
                bValue = 0;
            } else {
                bValue = fromCharDigit(b[i]);
            }
            int n = 0;

            if (aValue < bValue) {
                aValue = aValue + 10;

                while (fromCharDigit(a[i + 1 + n]) == 0) {
                    a[i + 1 + n] = toCharDigit(9);
                    n++;
                }
                a[i + 1 + n] = toCharDigit(fromCharDigit(a[i + 1 + n]) - 1);
            }


            int subValues = aValue - bValue;


            result[i] = toCharDigit(subValues);
        }
        return result;
    }

    public static char[] sum1(char[] a, char[] b) {

        int maxLength = Math.max(a.length, b.length);

        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        char result[] = new char[maxLength];
        for (int k = 0; k < result.length; k++) {
            result[k] = toCharDigit(0);
        }

        int forTransfer = 0;

        for (int i = 0; i < maxLength; i++) {

            int aValue = fromCharDigit(a[i]);


            int bValue;

            if (i > b.length - 1) {
                bValue = 0;
            } else {
                bValue = fromCharDigit(b[i]);
            }

            int sumValues = aValue + bValue + forTransfer;

            if (sumValues >= 10) {
                forTransfer = 1;
                sumValues = sumValues - 10;
            } else {
                forTransfer = 0;
            }

            result[i] = toCharDigit(sumValues);
        }

        if (forTransfer > 0) {
            result[result.length - 1] = toCharDigit(forTransfer);
        }

        return prepareToReturn(result);
    }


    public static char[] multiply(char[] a, char[] b) {

        reverse(a);
        reverse(b);

        int maxLength = Math.max(a.length, b.length);

        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        char result[] = new char[a.length + b.length];
        char RES[] = new char[result.length];
        char temp[] = new char[result.length];

        for (int k = 0; k < result.length; k++) {
            temp[k] = toCharDigit(0);
            result[k] = toCharDigit(0);
        }

        int forTransfer = 0;
        int l = 0;

        while (l < b.length) {
            char ar[] = new char[result.length];
            for (int k = 0; k < result.length; k++) {
                ar[k] = toCharDigit(0);
            }
            for (int i = 0; i < maxLength; i++) {

                int aValue = fromCharDigit(a[i]);

                int bValue;

                bValue = fromCharDigit(b[l]);

                int mulValues = aValue * bValue + forTransfer;
                int m = mulValues;
                int j = 0;

                while (m >= 10) {
                    m = m - 10;
                    j++;
                }
                forTransfer = j;
                mulValues = mulValues - j * 10;

                result[i + l] = toCharDigit(mulValues);
                if (forTransfer > 0 & i == maxLength - 1) {
                    result[i + l + 1] = toCharDigit(forTransfer);
                    forTransfer = 0;
                }
            }
            RES = sum1(result, temp);
            temp = RES;
            result = ar;
            l++;
        }

        if (forTransfer > 0) {
            RES[RES.length - 1] = toCharDigit(forTransfer);
        }

        reverse(RES);
        return prepareToReturn1(RES);
    }

    public static boolean D(char[] s, char[] n) {

        char temp[] = new char[s.length];
        for (int i = 0; i < s.length; i++) {
//            char N[] = new char[s.length];
//            for (int f = 0; f < n.length; f++) {
//                N[f] = toCharDigit(fromCharDigit(n[f]));
//            }
//                for (int j = n.length; j < s.length; j++) {
//                    N[j] = toCharDigit(0);
//                }
//                char N[] = new char[s.length];
//                N = n;
//                    if(n.length < s.length){
//                        char N[] = new char[s.length];
//                        for (int d = n.length; d < s.length; d++){
//                            N[d] = toCharDigit(0);
//                        }
//                 if(i >= n.length){
//                    toCharDigit(n[i]) = 0;
//                }
            if (s.length > n.length) {
                return false;

            } else {
                if (fromCharDigit(s[i]) < fromCharDigit(n[i])) {
                    temp = n;
                    n = s;
                    s = temp;
                }
            }
        }
        if (s == temp) {
            return true;
        } else {
            return false;
        }

    }

    //
//    public static char[] div(char[] a, char[] b) {
//
//        int maxLength = Math.max(a.length, b.length);
//
//        if (a.length != maxLength) {
//            char temp[] = a;
//            a = b;
//            b = temp;
//        }
//        char B[] = new char[maxLength];
//
//        for (int i = 0; i < b.length; i++){
//            B[i] = b[i];
//        }
//        for (int i = b.length; i < maxLength; i++){
//            B[i] = toCharDigit(0);
//        }
//
//
//        int t = 1;
//        char temp[] = new char[maxLength];
//        char A[] = new char[maxLength];
//        A = a;
//        temp = sub1(A, B);
//        while(D(sub1(A, B), B) == false ){
//            temp = sub1(A, B);
//            sub(temp, B);
//            t++;
//        }
//
//        char result[] = new char[maxLength];
//
//        result[0] = toCharDigit(t);
//
//        while(D(sub1(temp, b), b) == false ){
//            temp = sub1(temp, b);
//            t++;
//        }
//
//
//        int forTransfer = 0;
//
//        for (int i = 0; i < maxLength-1; i++) {
//
//            int aValue = fromCharDigit(a[i])*10 + fromCharDigit(a[i+1]);
//
//
//            int bValue;
//            int n = 0;
//                bValue = fromCharDigit(b[i]) + fromCharDigit(b[i]);
//
//
//
//            int divValues = aValue / bValue + forTransfer;
//
//            if (divValues >= 10) {
//                forTransfer = 1;
//                divValues = divValues - 10;
//            } else {
//                forTransfer = 0;
//            }
//
//            result[i] = toCharDigit(divValues);
//        }
//
//        if (forTransfer > 0) {
//            result[result.length - 1] = toCharDigit(forTransfer);
//        }
//
//        return prepareToReturn(result);
//    }
    public static char[] div(char[] a, char[] b) {            //___________  // деление;

        reverse(a);
        reverse(b);

        // вычисляем длину макисмального
        int maxLength = Math.max(a.length, b.length);

        // если первое число не максимальное по длине
        // меняем их местами
        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        if (a.length == b.length) {//если числа равны по длинне, сравниваем поразрядно;

            for (int i = a.length - 1; i > 0; i--) {

                if (a[a.length - 1] < b[b.length - 1]) {
                    char temp[] = a;
                    a = b;
                    b = temp;
                    break;
                }
            }
        }

        // здесь храним результат, он всегда может быть на 1-ну цифру больше
        char result[] = new char[maxLength];

        // здесь храним разряд для переноса
        int forTransfer = 0;
        int subValues = 0;
        int m = 0; //переключатель
        char[] div = "0".toCharArray();
        char[] one = "1".toCharArray();
        int maxLength2 = 0;
        int pro2 = 0; //переменная для сравнения;
        int pro1 = 0;


        while (m != 1) {
            // бежим по максмальному числу
            for (int i = 0; i < maxLength; i++) {
                // забираем числовое представление символа
                int aValue = fromCharDigit(a[i]);

                int bValue;
                // если второе число кончилось
                if (i > b.length - 1) {
                    // ставим нолик
                    bValue = 0;
                } else {
                    // в противном случае забираем числовое представление символа
                    bValue = fromCharDigit(b[i]);
                }

                // резлультат вычитания двух чисел на одинаковых разрядах
                if (aValue >= bValue) {
                    subValues = aValue - forTransfer - bValue;
                    forTransfer = 0;
                    if (subValues == -1) {
                        subValues = 9;
                        forTransfer = 1;
                    }

                }
                // если резльутат превысел 10
                if (bValue > aValue) {
                    forTransfer = 1;
                    subValues = (aValue + 10) - bValue;


                }


                result[i] = toCharDigit(subValues);
            }
            if (forTransfer > 0) {
                result[result.length - 1] = toCharDigit(forTransfer);
            }
            forTransfer = 0;

            a = result;
            //System.out.println(a);

            for (int i = a.length - 1; i >= 0; i--) {    //поразрядная проверка числа;
                pro1 = fromCharDigit(a[i]);

                if (i > b.length - 1) {
                    pro2 = 0;
                } else pro2 = fromCharDigit(b[i]);

                if (pro1 > pro2) {
                    break;
                }

                if (pro1 < pro2) {
                    m = 1;
                    break;
                }

            }

            div = sum(div, one);
            if (m == 1) break;

        }

        // в конце программы если остался остаток
        if (forTransfer > 0) {
            result[result.length - 1] = toCharDigit(forTransfer);
        }

        reverse(result);
        return prepareToReturn(div);
    }

    public static char[] div1(char[] a, char[] b) {            // деление;

        reverse(a);
        reverse(b);

        int maxLength = Math.max(a.length, b.length);

        if (a.length != maxLength) {
            char temp[] = a;
            a = b;
            b = temp;
        }

        if (a.length == b.length) {   //если числа равны по длинне, сравниваем поразрядно;

            for (int i = a.length - 1; i > 1; i--) {

                if (a[a.length - 1] < b[b.length - 1]) {
                    char temp[] = a;
                    a = b;
                    b = temp;
                    break;
                }
            }
        }

        char result[] = new char[maxLength];

        int m = 0; //переключатель
        char[] div = "0".toCharArray();
        char[] one = "1".toCharArray();
        int pro2; //переменная для сравнения;
        int pro1;

        while (m != 1) {
            result = sub1(a, b);

            a = result;

            for (int i = a.length - 1; i >= 0; i--) {    //поразрядная проверка числа;
                pro1 = fromCharDigit(a[i]);
                if (i > b.length - 1) {
                    pro2 = 0;
                } else pro2 = fromCharDigit(b[i]);
                if (pro1 > pro2) {
                    break;
                }
                if (pro1 < pro2) {
                    m = 1;
                    break;
                }
            }
            div = sum(div, one);
            if (m == 1) break;

        }
        reverse(result);
        return prepareToReturn(div);
    }
}



