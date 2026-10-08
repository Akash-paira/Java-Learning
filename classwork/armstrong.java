package classwork;

public class armstrong {

    public static void main(String[] args) {
        for (int i = 10; i <= 100000; i++) {
            int n = i;
            int temp = n;
            int count = 0;
            while (n > 0) {
                count++;
                n /= 10;
            }
            n = temp;
            int sum = 0;
            while (n > 0) {
                int r = n % 10;
                sum += (int)Math.pow(r, count);
                n /= 10;
            }
            if (sum == temp) {
                System.out.println(temp + " is an Armstrong number");
            }
        }
    }
}
