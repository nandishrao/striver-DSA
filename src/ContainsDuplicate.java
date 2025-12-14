class CheckDuplicate {
    public Boolean CheckingDuplicatee(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,9,7,2,};
        CheckDuplicate c = new CheckDuplicate();
       Boolean result = c.CheckingDuplicatee(arr);
       System.out.print(result);


    }
}
