public class Prime {
    public static void main(String[] args) {
        int n = 14;  // change this number to test others
        boolean isPrime = true;

        // numbers <= 1 are not prime
        if (n <= 1) {
            isPrime = false;
        } else {
            // check divisors from 2 to sqrt(n)
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is NOT a prime number");
        }
    }
}
