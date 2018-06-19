//猜年龄
public class A014 {
    public static int getFifthAge(int n) {
        if (n == 1)
            return 10;
        return getFifthAge(n - 1) + 2;
    }

    public static void main(String[] args) {
        int fifthAge = getFifthAge(5);
        System.out.println("第五个人的年龄是"+fifthAge);
    }
}
