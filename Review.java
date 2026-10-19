import java.util.Scanner;
//for循环输入1-5
public class Review {
    public static void main(String[] args){
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
//        Scannner的用法
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数");
        int n=sc.nextInt();
    }
}
