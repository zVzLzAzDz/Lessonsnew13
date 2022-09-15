import java.util.Scanner;

// output only even (чётные) number
// with continue operator
public class Task03 {

    public static String getALLEventNumbers(int number) {
        String msg = "";
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                continue;
            }
            msg += i + " ";
            //....

        }

        return msg;

    }

    public static void main(String[] args) {

        int number = Task02.inputPositiveNumber();

        String result = getALLEventNumbers(number);

        System.out.println(result);
    }
}
