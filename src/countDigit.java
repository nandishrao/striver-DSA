public class countDigit {
    public static void main(String[] args) {
        int n = 001; // contains zeros
        int count = 0;

        if (n == 0) {
            System.out.println(1);
            return;
        }

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
//A number starting with 0 is treated as OCTAL (base-8), not decimal.