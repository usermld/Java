package SEMINAR;

public class Task6 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(strCompress(str));

    }

    public static String strCompress(String str) {
        StringBuilder finish_str = new StringBuilder();
        int count = 1;
        char curentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) ==  curentChar) {
                count++;
            }
            else {
                finish_str.append(curentChar).append(count);
                count =  1;
                curentChar = str.charAt(i);
            }
            
        }
        finish_str.append(curentChar).append(count);
        return finish_str.toString();
        
    }
}