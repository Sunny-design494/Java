package method;
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*键盘录入5个整数存入数组当中，超出0-100，重新录入*/
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数：");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                arr[i] = num;
            } else {
                System.out.println("输入的数字超出范围，请重新输入。");
                i--;
            }
        }
        int max1 = findMax(arr);
        int min1 = findMin(arr);
        /*平均分=（总分-最大值-最小值）/5*/
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = (sum - max1 - min1) / (arr.length - 2);
        System.out.println("平均分是：" + avg);
    }

    /*定义方法求最大值和最小值*/
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
