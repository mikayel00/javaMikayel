package homework3;

public class java4_c {
    public static void main(String[] args) {
        String str1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, ";
        String str2 = "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String str1a = str1.substring(0,28);
        String str3 = str1a + str2;
        String[] str = str3.split(" ");
        for (int i = 0;i < str.length;i++){
            System.out.print(str[i] + " ");
        }
    }
}
