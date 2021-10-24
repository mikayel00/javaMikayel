package homework3;

import java.util.Locale;

public class java4_a {
    public static void main(String[] args) {
        String str1 = "lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        String str2 = "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String str3 = str1 + str2;
        String[] str = str3.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0){
                str[i]=str[i].toLowerCase();
            }
            if (i % 2 != 0 ){
                str[i]=str[i].toUpperCase();
            }
        }
        for (int i = 0; i <str.length; i++)
            System.out.print(str[i] + " ");
    }
}
