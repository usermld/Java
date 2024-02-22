package SEMINAR;

public class Task5 {
    public static void main(String[] args) {
        int n = 100000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        getAlternatingChars(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        getAlternatingSB(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

    }

    public static String getAlternatingChars(int n, char c1, char c2) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str;
    }

    public static String getAlternatingSB(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1).append(c2);
        }
        return sb.toString(); //sysout(sb)
    }
}
