public class Theclass {

    public static void methodA(String input) {
        System.out.println("J");
        if (!input.equals("start")) {
            System.out.println("a");
        } else {
            System.out.println("a");
            System.out.println("v");
            methodC(input);
        }
        System.out.println(" ");
    }

    public static void methodB(String start) {
        System.out.println("e");
        System.out.println("r");
    }

    public static int methodC(String input) {
        System.out.println("a");
        System.out.println(" ");
        System.out.println("s");
        methodD(input.length());
        return 0;
    }

    public static void methodD(int number) {
        System.out.println("j");
        System.out.println("o");
        if (number > 5) {
            System.out.println("o");
        }
        System.out.println("v");
        System.out.println("t");

    }
}
