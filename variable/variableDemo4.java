package variable;
//确定 Scanner位置
import java.util.Scanner;

public class variableDemo4 {
    public static void main(String[] args) {
        /*

        键盘录入：
         1.找到Scanner打工人
         2.让它干活
         */

        //1.找到Scanner打工人
        Scanner sc = new Scanner(System.in);

        //2.让它干活
        //接受键盘录入的整数
        /*int num = sc.nextInt();
        System.out.println(num);*/

        /*double num = sc.nextDouble();
        System.out.println(num);*/
        //接受键盘录入的小数

        String num = sc.next();
        System.out.println(num);
        //接受键盘录入的文本（字符串）

    }
}
