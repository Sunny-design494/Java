package ifdemo;
import java.util.Scanner;
public class ifDemo2 {
    public static void main(String[] args){
        int hp = 200;
        System.out.println("请输入当前人物受到的伤害：");
        Scanner sc = new Scanner(System.in);
        int hurt = sc.nextInt();
        hp = hp - hurt;
        if(hp <= 0){
            hp = 1;
        }
        System.out.println("当前人物血条：" + hp);
        System.out.println("请输入技能恢复的血量：");
        int add = sc.nextInt();

        hp = hp + add;
        if(hp > 200){
            hp = 200;

        }
        System.out.println("当前人物血条：" + hp);
    }
}
