package homework3;

public class java3 {
    public static void main(String[] args) {
        String str = "Hi there";
        String secondWord = "";
        char[] myChar = str.toCharArray();
        for (int i = 0;i < myChar.length / 2;i++) {
            char temp = myChar[i];
            myChar[i] = myChar[myChar.length - 1 - i];
            myChar[myChar.length - 1 - i] = temp;
        }
        String newStr = new String(myChar);
        if(newStr.equals(str)) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
