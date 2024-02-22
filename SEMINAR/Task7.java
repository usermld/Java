package SEMINAR;

public class Task7 {
    public static void main(String[] args) {
        String str = "abccba";

        System.out.println(polindrom(str));

    }
    public static Boolean polindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}
