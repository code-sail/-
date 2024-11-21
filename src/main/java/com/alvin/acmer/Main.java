package com.alvin.acmer;

import javax.print.DocFlavor;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 高精度加法
 */
//public class Main {
//    public static int N = 100010;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next(), b = sc.next();
//        List<Integer> A = new ArrayList<>(), B= new ArrayList<>();
//        for(int i = a.length() - 1; i >= 0; i --)   A.add(a.charAt(i) - '0');
//        for(int i = b.length() - 1; i >= 0; i --)   B.add(b.charAt(i) - '0');
//
//        List<Integer> C = add(A, B);
//
//        for(int i = C.size() - 1; i >= 0; i --){
//            System.out.printf(C.get(i));
//        }
//    }
//
//    public static List add(List A, List B) {
//        if (A.size() < B.size()) return add(B, A);
//
//        List<Integer>  C= new ArrayList<>();
//        int t = 0;
//        for (int i = 0; i < A.size(); i ++ )
//        {
//            t += (int)A.get(i);
//            if (i < B.size()) t += (int)B.get(i);
//            C.add(t % 10);
//            t /= 10;
//        }
//
//        if (t > 0) C.add(t);
//        return C;
//    }
//}


/**
 * 高精度减法
 */
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next(), b = sc.next();
//        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
//        for(int i = a.length() - 1; i >= 0; i --)   A.add(a.charAt(i) - '0');
//        for(int i = b.length() - 1; i >= 0; i --)   B.add(b.charAt(i) - '0');
//
//        List C = sub(A, B);
//
//
//        for(int i = C.size() - 1; i >=0 ; i --)
//            System.out.printf("%d", (int)C.get(i));
//
//    }
//
//    public static List sub(List A, List B) {
//        if(!cmp(A,B)) {
//            System.out.printf("-");
//            return sub(B, A);
//        }
//
//        List<Integer> C = new ArrayList<>();
//        int t = 0;
//        for(int i = 0; i < A.size(); i ++) {
//            t = (int)A.get(i) - t;
//            if(i < B.size())    t -= (int)B.get(i);
//            C.add((t + 10) %10);
//            if(t < 0)   t = 1;
//            else    t = 0;
//        }
//        //去掉前导零
//        while(C.size() > 1 && C.get(C.size() - 1) == 0)  C.remove(C.size() - 1);
//        return C;
//    }
//
//    public static boolean cmp(List<Integer> A,List<Integer> B){
//        if(A.size() != B.size()) return A.size() > B.size();
//       /* if(A.size() >= B.size()){
//            return true;
//        }else{
//            return false;
//        }
//        */
//        for(int i = A.size() - 1;i >= 0;i --){
//            if(A.get(i) != B.get(i)) {
//                return A.get(i) > B.get(i);
//            }
//        }
//        return true;
//    }
//
//}

/**
 * 高精度乘法
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
//        for (int i = a.length() - 1; i >= 0; i--) A.add(a.charAt(i) - '0');
//        int b = sc.nextInt();
//
//        List C = mul(A, b);
//
//
//        for (int i = C.size() - 1; i >= 0; i--)
//            System.out.printf("%d", (int) C.get(i));
//
//    }
//
//    public static List mul(List A, int b) {
//
//        List<Integer> C = new ArrayList<>();
//        int t = 0;
//        for (int i = 0; i < A.size() || t > 0; i++) {
//            if (i < A.size()) t += (int)A.get(i) * b;
//            C.add(t % 10);
//            t = t / 10;
//        }
//        //去掉前导零
//        while (C.size() > 1 && C.get(C.size() - 1) == 0) C.remove(C.size() - 1);
//        return C;
//    }
//}

/**
 * 高精度除法
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
//        for (int i = a.length() - 1; i >= 0; i--) A.add(a.charAt(i) - '0');
//        int b = sc.nextInt();
//
//        List C = div(A, b);
//    }
//
//    public static List div(List A, int b) {
//
//        List<Integer> C = new ArrayList<>();
//        int t = 0;
//        for (int i = A.size() - 1; i >= 0; i --) {
//            if (i < A.size()) t = t * 10 + (int)A.get(i);
//            C.add(t / b);
//            t = t % b;
//        }
//        //去掉前导零
//        //注意这里： 除法的前导零是C数组的第0位
//        while (C.size() > 1 && C.get(0) == 0) C.remove(0);
//
//        for (int i = 0; i < C.size(); i ++)
//            System.out.printf("%d", (int) C.get(i));
//        System.out.println();
//        System.out.println(t);
//        return C;
//    }
//}

/**
 * 前缀和
 */
//    public class Main{
//        public static int N = 100010;
//        public static int [] a = new int[N], s = new int[N];
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt(), m = sc.nextInt();
//            for(int i = 1; i <= n; i ++) {
//                a[i] = sc.nextInt();
//                s[i] = s[i - 1] + a[i];
//            }
//            while(m -- > 0) {
//                int l = sc.nextInt(), r = sc.nextInt();
//                System.out.println(s[r] - s[l - 1]);
//            }
//        }
//}

/**
 * 子矩阵的和（二维前缀和）
 */
//public class Main{
//    public static int N = 1010;
//    public static int [][] a = new int[N][N], s = new int[N][N];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();
//        for(int i = 1; i <= n; i ++) {
//            for(int j = 1; j <= m; j ++){
//                a[i][j] = sc.nextInt();
//                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i][j];
//            }
//        }
//
//        while(q -- > 0) {
//            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
//            System.out.println(s[x2][y2] - s[x1 - 1][y2] - s[x2][y1 - 1] + s[x1 - 1][y1 - 1]);
//        }
//    }
//}

/**
 * 差分
 */
//public class Main{
//    public static int N = 100010;
//    public static int [] a = new int[N], b = new int[N];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(), m = sc.nextInt();
//        for(int i = 1; i <= n; i ++) {
//            int k = sc.nextInt();
//            b[i] += k;
//            b[i + 1] -= k;
//        }
//        while(m -- > 0) {
//            int l = sc.nextInt(), r = sc.nextInt(), c = sc.nextInt();
//            b[l] += c;
//            b[ r + 1] -= c;
//        }
//
//        for(int i = 1; i <= n; i ++)    b[i] += b[i - 1];
//        for(int i = 1; i <= n; i ++) System.out.println(b[i]);
//    }
//
//}

/**
 * 差分矩阵（二维差分）
 */
import java.util.Scanner;

public class Main{
    public static int N = 1010;
    public static int [][] b = new int[N][N];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), q = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                insert(i, j, i, j, sc.nextInt());
            }
        }

        while(q -- > 0){
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            int c = sc.nextInt();
            insert(x1, y1, x2, y2, c);
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                b[i][j] = b[i][j] + b[i - 1][j] + b[i][j - 1] - b[i - 1][j - 1];
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }


    }

    public static void insert(int x1, int y1, int x2, int y2, int c){
        b[x1][y1] += c;
        b[x2 + 1][y2] -= c;
        b[x2][y2 + 1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }
}

