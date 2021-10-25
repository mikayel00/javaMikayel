package homework4;

public class java4 {
    public static void main(String[] args) {
        String str = "Any text and sentence here";
        String[] newStr = str.split(" ");
        String longest = newStr[0];
        for (int i = 0; i < newStr.length; i++) {
            String temp = newStr[i];
            for (int j = 0; j < temp.length(); j++) {
                String[] myChar = temp.split("");
                if (longest.length() < myChar.length) {
                    longest = newStr[i];
                }
            }
        }
        System.out.println(longest);
    }
}

