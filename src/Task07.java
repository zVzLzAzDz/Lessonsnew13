public class Task07 {

    public static int sum(int a, int b) {
        // logic
        int result = a + b;
        return result;
    }

    public static void print(int result) {
        // output
        System.out.println(result);
    }


    public static void main(String[] args) {
//        int result = sum(16,7);
//        print(result);
        System.out.println(sum(0, 0) == 0);
        System.out.println(sum(1, 2) == 3);
        System.out.println(sum(3, 4) == 8);
    }
}
