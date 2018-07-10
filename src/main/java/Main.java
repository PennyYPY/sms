import java.util.HashMap;
import java.util.Scanner;

/**
 * 小米
 题目描述
 继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替
 （"ZERO", "ONE", "TWO", "THREE", "FOUR",
 "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"），
 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 */
/**
 * 输入 第一行是一个整数T（1<=T<=100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
 * 样例输入
 * 4
 * EIGHT
 * ZEROTWOONE
 * OHWETENRTEO
 * OHEWTIEGTHENRTEO
 * 输出 输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。
 * 0
 * 234
 * 345
 * 0345
 */
class Solve{
    static String solve(String input){
        HashMap count = new HashMap();
        String number = new String();
        for (int i = 'A';i<'Z' +1 ;i++){

        }
        return null;
    }
}

public class Main {

    static String[] tar = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
    static Integer[] result = {0,2,4,6,8,7,5,3,9,1};

    static char[] ch = {};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String tel;
        for (int i = 0; i < num; i++) {
            //取出一行中的电话号码；
            tel = scanner.nextLine();

        }

    }

}
