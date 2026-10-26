package Operator;

import java.util.Scanner;

public class OperatorDemo1 {
    public static void main(String[] args) {
        //1.找Scanner
        Scanner sc = new Scanner(System.in);
        //2.工作开始
        //2.1.接受键盘录入的体重
        System.out.println("请输入你的体重：");
        double weight = sc.nextDouble();
        //2.2.接受键盘录入的身高
        System.out.println("请输入你的身高：");
        double height = sc.nextDouble();
        //3.计算BMI
        double bmi = weight / (height * height);
        System.out.println("你的BMI指数是：" + bmi);
    }
}
