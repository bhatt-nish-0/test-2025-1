public class TwoZeroTwoFiveFirst {
    public static void main(String[] args) {
        First first = (int y) -> {
            System.out.println(y);return "a";};
        String returned = first.first(89);
        System.out.println("returning is " + returned);
        System.out.println("ending....");
    }
}

interface First {
    String first(int r);
}