package array;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55, 33};

        System.out.println("请输入要查找的元素：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println("找到了元素：" + num);
                count ++;
                break;
            }



        }
        if(count == 0){
            System.out.println("该数据不存在");
        }

    }
}
