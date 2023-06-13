import java.util.*;
public class palindrome {
    public static boolean solution(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
//            only for understanding concept
//            System.out.println(str.charAt(i) + " " + str.charAt(n - i - 1));
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[]args){
            String str = "racecar";
        System.out.println(solution(str));

        }


}
