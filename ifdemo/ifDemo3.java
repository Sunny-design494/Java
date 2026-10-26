package ifdemo;
import java.util.Scanner;
public class ifDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入下单价格：");
        double price = sc.nextDouble();
        double blm = price * 0.9;
        double mt = 0;
        if(price >= 30){
            mt = price - 10;
        }else{
            mt = price;
        }
        if(blm >= mt){
            System.out.println("使用饱了么支付划算，优惠后价格为：" + blm);
        }else{
            System.out.println("使用美单支付划算，优惠后价格为：" +  mt);
        }
    }
}
