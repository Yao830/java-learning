/*打印 1~100 中能被 3 整除的数，最后一行输出总个数*/
public class DAY1 {
    public static void main(String[] args) {
        int count = 0;
        int sum=0;
        for (int i = 1; i <= 100; i++) {
            /*能被 3 整除但不能被 5 整除*/
            if (i % 3 == 0&&i%5!=0) {
                System.out.println(i);
                count++;
                sum=sum+i;
            }
        }
        System.out.println("总个数：" + count);
        System.out.println("总和"+sum);
    }
}
