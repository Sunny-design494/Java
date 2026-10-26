package variable;

import java.util.Scanner;

public class VariableDemo5 {
    public static void main(String[] args) {
        //1.找到Scanner打工人
        Scanner sc = new Scanner(System.in);

        //2.工作
        System.out.println("请键盘录入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请键盘录入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);

        //3.求和
        int sum = num1 + num2;
        System.out.println(sum);
    }
}
