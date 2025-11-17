    import java.util.Scanner;

    public class reverseNumber {
        public static void main(String[] args) {
           int n;
           int revNum=0;
           System.out.println("Enter a number to be reversed");
           Scanner scanner = new Scanner(System.in);
           n=scanner.nextInt();
           int original=n;
           while(n>0){
             int  lastDigit = n%10;
                revNum = (revNum*10)+lastDigit;
                n=n/10;
           }
            if( original == revNum){
                System.out.println("the number is palindrome");
            }else{
                System.out.println("the number is not palindrome");
            }
    System.out.println(revNum);
        }
    }

