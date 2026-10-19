public class MethodDemo {
    public static void main(String[] args) {
        int result = sum0fMul3();
        System.out.println("3的倍数之和：" + result);
    }

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//累加100以内能被3整除的数字
    public static int sum0fMul3() {
        int sum = 0;
        for (int i = 1; i > 0 && i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
