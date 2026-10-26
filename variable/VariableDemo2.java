package variable;

public class VariableDemo2 {
    public static void main(String[] args ) {
        /*
        定义8种数据类型的变量：

        整数类型：byte, short, int, long
        浮点类型：float, double
        字符类型：char
        布尔类型：boolean

        变量的定义格式：
        数据类型 变量名 = 变量值;
         */
        //1.定义一个byte类型的变量
        byte b = 10;
        System.out.println(b);

        //2.定义一个short类型的变量
        short s = 10;
        System.out.println(s);

        //3.定义一个int类型的变量
        int i = 10;
        System.out.println(i);

        //4.定义一个long类型的变量
        //细节：long类型的变量末尾加L
        long l = 10L;
        System.out.println(l);

        //5.定义一个float类型的变量
        //细节：float类型的变量末尾加F
        float f = 10.0F;
        System.out.println(f);

        //6.定义一个double类型的变量
        double d = 10.0;
        System.out.println(d);

        //7.定义一个char类型的变量
        //只有一个
        char c = 'a';
        System.out.println(c);

        //8.定义一个boolean类型的变量
        boolean bool = true;
        System.out.println(bool);
    }
}
