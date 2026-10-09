/*电脑随机想一个 1~100的数 一直猜到中为止*/
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        int secret =rand.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);

        int guess=0;

       while(guess!=secret) {
           System.out.println("请输入你猜的数：");
           guess=sc.nextInt();
            if (guess > secret) {
                System.out.println("大了");
            }
            else if (guess < secret) {
                System.out.println("小了");
            }
            else {
                System.out.println("猜对了");
            }
        }
    }

}
