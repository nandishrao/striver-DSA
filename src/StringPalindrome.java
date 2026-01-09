class PalinString{
    public static boolean ValidateStringPalindrome(String s){
        int left = 0;
        int right = s.length() -1;

       while(left < right){
           if(s.charAt(left) != s.charAt(right)){
               return false;
           }else{
               left++;
               right--;
           }
       }
        return true;

    }
}
public class StringPalindrome {
    public static void main(String[] args) {
        PalinString p = new PalinString();
        boolean result =p.ValidateStringPalindrome("TOOTd");
        System.out.println(result);
    }
}
