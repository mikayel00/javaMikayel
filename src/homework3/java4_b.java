package homework3;

public class java4_b {
    public static void main(String[] args) {
        String str1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit , ";
        String str2 = "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String str3 = str1 + str2;
        String[] str = str3.split(" ");
        int quantity = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("a")) {
                String temp = str[i];
                for (int j =0;j < temp.length();j++){
                    String[] myChar = temp.split("");
                    if (myChar[j].equals("a")) quantity++;
                }
            }
        }
        System.out.println("There are " + quantity + " 'a'.");
    }
}
