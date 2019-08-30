package nadiatests;
// palindrome 1221, 121
public class JavaPalindromeNumberExample {

    public static void main(String[] args) {
        int numbers[] = new int[]{121,13,34,11,22,54,3443};
        for(int i=0; i < numbers.length; i++){
            System.out.println(">>>>>>"+numbers[i]);
            if(isPalindrome(numbers[i]))
                System.out.println(numbers[i] + " is a palindrome number");
            else
                System.out.println(numbers[i] + " is not a palindrome number");
        }
    }
    //http://www.java-examples.com/java-palindrome-number-example
    public static boolean isPalindrome(int num) {
        int number = num;
        int sum  = 0;
        int remainder=0;
        /* If the number is equal to it's reversed number, then it is a palindrome number.
         * For example, 121 is a palindrome number while 12 is not.*/
        //reverse the number
        while(number > 0){
            remainder = number % 10;
            number = number / 10;
            sum = sum * 10 + remainder;
            System.out.println("remainder="+remainder+" number/10="+number+" sum="+sum);
        }
        if(num == sum)
            return true;
        else
            return false;
    }
}
