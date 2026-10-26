package Operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.定义变量记录秒数
        int seconds = 3661;

        //2.获取小时数
        int hours = seconds / 3600;
        System.out.println(hours);

        //3.获取分钟数
        int minutes = seconds % 3600 / 60;
        System.out.println(minutes);

        //4.获取秒数
        int second = seconds % 3600 % 60;
        System.out.println(second);
    }
}
