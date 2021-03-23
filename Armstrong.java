public class Armstrong {

    public static void main(String[] args) {
        int c = 0, a, temp;
        int n = 154;
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * b);
        }
        if (temp == c)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
