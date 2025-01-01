public class TwoZeroTwoFiveFirst {
    public static void main(String[] args) {
        First first = (int y) -> {
            System.out.println(y);return "a";};
        first.first(89);
    }
}

interface First {
    String first(int r);
}