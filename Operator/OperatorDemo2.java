package Operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Alt+回车自动纠错
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        System.out.println(num);
        //拆分
        int hundreds = num / 100;
        int tens = num / 10 % 10;
        int units = num % 10;
        System.out.println(" hundreds = " + hundreds);
        System.out.println(" tens = " + tens);
        System.out.println(" units = " + units);
    }
}
