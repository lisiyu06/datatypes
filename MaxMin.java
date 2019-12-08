package homework01;

/**
 * Author: lisiyu
 * Created: 2019/12/8
 */

// 给定三个 int 变量，求其中的最大值和最小值

public class MaxMin {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int num = 0;
        if (a < b) {
            num = b;
            b = a;
            a = num;
        }
        if (a < c) {
            num = c;
            c = a;
            a = num;
        }
        if (b < c) {
            num = c;
            c = b;
            b = num;
        }
        System.out.println("Max = " + a);
        System.out.println("Min = " + c);
    }
}
