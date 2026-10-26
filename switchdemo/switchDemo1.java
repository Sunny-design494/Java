package switchdemo;
import java.util.Scanner;
public class switchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        /*case穿透现象：当一个case执行完毕后，不break，而是执行下一个case，直到遇到break为止*/
        switch (month){
            case 11:
            case 12:
            case 1:
            case 2:
            System.out.println("冬季");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("春季");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("夏季");
            break;
            case 9:
            case 10:
            System.out.println("秋季");
            break;

        }

    }
}
