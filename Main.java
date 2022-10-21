public class Main {
    public static void main(String[] args) {

        compare(3);
        compare(6);
        compare(5);
    }
    public static void compare(int a) {
        if (a<5) {
            System.out.println("число меньше 5");
        } else if (a >=5) {
            System.out.println("число больше или равно 5");
        }
    }
}