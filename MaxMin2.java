package homework01;

import java.util.Scanner;

/**
 * Author: lisiyu
 * Created: 2019/12/8
 */
public class MaxMin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println("最大值：" + maxNum(a, b, c));
        System.out.println("最小值：" + minNum(a, b, c));
    }

    public static int maxNum(int a, int b, int c) {
        int max = 0;
        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    public static int minNum(int a, int b, int c) {
        int min = 0;
        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
