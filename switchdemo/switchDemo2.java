package switchdemo;

public class switchDemo2 {
    public static void main(String[] args){
        /*
        switch新特性
        1.箭头标签
        2.case后可以跟多个值
        3.switch可以有运算结果
        4.yield关键字,返回结果
        */

//        int num = 7;
//        String result = switch (num){
//            case 10 -> {
//                yield "10";
//            }
//            case 20,30 -> {
//                yield "20或30";
//            }
//            default -> {
//                yield "其他";
//            }
//        };
//        System.out.println(result);

        /*模拟计算器*/
        int a = 0;
        int b = 0;
        String operator = "=";
        int result = switch (operator){
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
         };
        System.out.println(result);

    }

}
