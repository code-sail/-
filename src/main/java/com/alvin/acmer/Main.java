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
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        List<Integer> A = new ArrayList<>(), B = new ArrayList<>();
        for(int i = a.length() - 1; i >= 0; i --)   A.add(a.charAt(i) - '0');
        for(int i = b.length() - 1; i >= 0; i --)   B.add(b.charAt(i) - '0');

        List C = sub(A, B);


        for(int i = C.size() - 1; i >=0 ; i --)
            System.out.printf("%d", (int)C.get(i));

    }

    public static List sub(List A, List B) {
        if(!cmp(A,B)) {
            System.out.printf("-");
            return sub(B, A);
        }

        List<Integer> C = new ArrayList<>();
        int t = 0;
        for(int i = 0; i < A.size(); i ++) {
            t = (int)A.get(i) - t;
            if(i < B.size())    t -= (int)B.get(i);
            C.add((t + 10) %10);
            if(t < 0)   t = 1;
            else    t = 0;
        }
        //去掉前导零
        while(C.size() > 1 && C.get(C.size() - 1) == 0)  C.remove(C.size() - 1);
        return C;
    }

    public static boolean cmp(List<Integer> A,List<Integer> B){
        if(A.size() != B.size()) return A.size() > B.size();
       /* if(A.size() >= B.size()){
            return true;
        }else{
            return false;
        }
        */
        for(int i = A.size() - 1;i >= 0;i --){
            if(A.get(i) != B.get(i)) {
                return A.get(i) > B.get(i);
            }
        }
        return true;
    }

}