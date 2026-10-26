package ifdemo;

public class ifDemo1 {
    public static void main(String[] args) {
        /*
        定义一个变量表示体温，对体温进行判断是否大于等于37.5，如果超过打印语音警告
        */
        //1.定义一个变量表示体温
        double temperature = 37.5;
        //2.对体温进行判断是否大于等于37.5，如果超过打印语音警告
        if (temperature >= 37.5) {
            System.out.println("语音警告");
        }
    }
}
