package homework01;

/**
 * Author: lisiyu
 * Created: 2019/12/6
 */

// 给定两个 int 变量，交换变量的值

public class Exchange {

    // 方法 1：创建临时变量
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;

        int num = 0;
        num = a;
        a = b;
        b = num;
        System.out.println(a);
        System.out.println(b);
    }

    // 方法 2：使用加减法
    public static void main2(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    // 方法 3：使用异或
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
