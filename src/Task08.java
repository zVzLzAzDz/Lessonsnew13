


public class Task08 {

    public static boolean checkPalindrome(int number) {

        int copy = number;
        int num = 0;

        while (copy > 9) {
            num += copy % 10;
            num *= 10;
            copy /= 10;

        }
        num += copy % 10;
        return num == number;
    }

    public static void main(String[] args) {

        int number = Task02.inputPositiveNumber();

        boolean result = checkPalindrome(number);

        String msg = result ? "Number is palindrome" : "Number isn't palindrome";

        System.out.println(msg);
    }
}