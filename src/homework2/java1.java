package homework2;

public class java1 {
    public static void main(String[] args) {
        /* ---- 1 ---- */
        int a = 7;
        int b = 3;

        System.out.println("Arithmetical operators");
        //arithmetical operators
        System.out.println(a + b);  //+
        System.out.println(a - b);  //-
        System.out.println(a * b);  // multiply
        System.out.println(a / b);  // divide and take whole part
        System.out.println(a % b);  // divide and take remainder
        System.out.println(a++);    //increment (adding 1 after returning result)
        System.out.println(++a);    //increment (adding 1 before returning result)
        System.out.println(a--);    //decrement (subtracting 1 after returning result)
        System.out.println(--a);    //decrement (subtracting 1 before returning result)

        System.out.println("Relational operators");
        //relational operators
        System.out.println(a == b);   //check if equals
        System.out.println(a != b);   //check if not equals
        System.out.println(a > b);    //check if a more b
        System.out.println(a < b);    //check if b more a
        System.out.println(a >= b);    //check if a more or equals b
        System.out.println(a <= b);    //check if a less or equals b

        //logical operators
         /* && - logical and
            || - logical or
             ! - logical not
         */

        //bitwise operators
        /*
            & - binary and
            | - binary or
            ^ - binary xor
            ~ - binary number reverse
            << - shift left
            >> - shift right
        */

        System.out.println("Assignment operators");
        //assignment operators
        int c = 0;
        System.out.println(c+=a);
        System.out.println(c*=b);
        System.out.println(c/=b);
        System.out.println(c%=a);
    }
}
