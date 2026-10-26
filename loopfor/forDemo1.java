package loopfor;
import java.util.Scanner;
public class forDemo1 {
    public static void main(String[] args) {
        /*
        for循环的格式：
        for(初始化语句;条件判断语句;条件控制语句){
            循环体
        }
        */

        //循环开始条件
        //结束条件
        //重复代码


        //       练习一：倒着输出数字
        //       for(int i = 5; i >= 1; i--){
        //            System.out.println(i);
        //        }


        //        练习二：求1-5的和
        //        for(int i = 5; i >= 1; i--){
        //            sum += i;
        //        }
        //        System.out.println(sum);


        //         练习三：求1-100之间的偶数和
        //         int sum = 0;
        //         for(int i = 1; i <= 100; i++){
        //             if(i % 2 == 0) {
        //                 sum += i;
        //             }
        //         }
        //         System.out.println(sum);


        //练习四：求一个范围内被3和5整除的整数个数

        /*输入两个数表示范围*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        /*求数字最大值最小值，确定范围*/
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;

        /*循环范围，判断是否被3和5整除，计数*/
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                count++;
        }

        /*输出结果*/
        if (count != 0) {
            System.out.println("在" + min + "到" + max + "之间，被3和5整除的整数个数为：" + count);
        } else {
            System.out.println("在" + min + "到" + max + "之间，没有被3和5整除的整数");
        }
    }
}