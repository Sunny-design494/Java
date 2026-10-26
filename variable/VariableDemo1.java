package variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*微信余额：0元
        支付宝余额：10元
        银行余额：20元
        问题一:一共多少钱？
        问题二:微信余额不足，从支付宝转10元到微信，现在微信和支付宝各多少钱？
         */


        //1.定义一个变量微信余额
        double wechatBalance = 0.0;

        //2.定义一个变量支付宝余额
        double alipayBalance = 10.0;

        //3.定义一个变量银行余额
        double bankBalance = 20.0;

        //4.输出一共多少钱？
        System.out.println("一共多少钱？" + (wechatBalance + alipayBalance + bankBalance) + "元");

        //5.从支付宝转10元到微信，现在微信和支付宝各多少钱？
        wechatBalance += 10.0;
        alipayBalance -= 10.0;
        System.out.println("微信余额：" + wechatBalance + "元");
        System.out.println("支付宝余额：" + alipayBalance + "元");
    }
}
