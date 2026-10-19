//方法调用
public class MathTools {
    public static void main(String[] args) {
        System.out.println(maxof(3,8));
        System.out.println(maxof(10,2));
        System.out.println(maxof(5,5));
        System.out.println(factorial(5));
        System.out.println(isPrime(11));
        System.out.println(isPrime(1));
        System.out.println(areaOfCircle(2));
    }
//    判断是否是素数
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
            return false;
        }
    }
        return true;
    }

//阶乘
    public static int factorial(int n){
       int result=1;
       for(int i=1;i<=n;i++){
           result*=i;
        }
       return result;
    }
//输出较大值
        public static int maxof(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

//    计算圆的面积
public static double areaOfCircle(double r) {
        double area=3.14*r*r;
        return area;
}
}
