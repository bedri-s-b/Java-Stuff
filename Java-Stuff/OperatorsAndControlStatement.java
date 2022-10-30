import java.math.BigDecimal;

public class OperatorsAndControlStatement {
    public static void main(String[] args) {

        /**
         * binary operands
         */

        int b = 2;
        System.out.println(Integer.toBinaryString(b) + " binary = " + b + " decimal");
        b = b << 2;
        System.out.println(Integer.toBinaryString(b) + " binary = " + b + " decimal");

        int b1 = 8;
        System.out.println(Integer.toBinaryString(b1) + " binary = " + b1 + " decimal");
        b1 = b1 >> 2;
        System.out.println(Integer.toBinaryString(b1) + " binary = " + b1 + " decimal");

        int b2 = 42;
        int b2a = ~b2;
        System.out.println(Integer.toBinaryString(b2) + " binary = " + b2 + " decimal");
        System.out.println(Integer.toBinaryString(b2a) + " binary = " + b2a + " decimal");

        String str = "11111111111111111111111111010101";

        System.out.println(str.length());

        int b5 = 2;
        System.out.println(Integer.toBinaryString(b5) + " binary = " + b5 + " decimal");
        b5 = b5 << 2;
        System.out.println(Integer.toBinaryString(b5) + " binary = " + b5 + " decimal");

        boolean a6 = true;
        boolean b7 = false;
        boolean c7 = true ^ false ^ true ^ true;
        boolean c8 = false | false | true;
        System.out.println("------------------------------------------------------");
        System.out.println(c7);
        System.out.println(c8);
        System.out.println("------------------------------------------------------");


        /**
         * divide by zero
         */

        int integerNum = 5;
        double doubleNum = 5.0;

        //Exception java.lang.ArithmeticException, cannot divide int by zero;
//        System.out.println(integerNum / 0);

        // output - Infinity
        System.out.println(doubleNum / 0.0);
        //Exception java.lang.ArithmeticException, cannot divide int by zero;

//        if (integerNum / 0 == 0){
//            System.out.println("boolean is past");
//        }

        // in this case get first true,that is reason, does not give error
        if (true || integerNum / 0 == 0) {
            System.out.println("boolean is past");
        }

        /**
         *
         *
         *
         */
        int integer1 = 8;
        //27 9
        System.out.println(++integer1 * 3 + " " + integer1);

        int integer2 = 8;
        //24 9
        System.out.println(integer2++ * 3 + " " + integer2);

        int integer3 = 8;
        //8 9
        System.out.println(integer3++ + " " + integer3);

        int a9, b9, c9, d9;
        a9 = b9 = c9 = d9 = 20;
        // 20 20 20 20
        System.out.println(a9 + " " + b9 + " " + c9 + " " + d9);

        a9 += b9 -= c9 *= d9 /= 20;

        // 20 0 20 1
        System.out.println(a9 + " " + b9 + " " + c9 + " " + d9);

        // other exam
        int x10 = 2;
        int y10 = 0;

        for (; y10 < 10; ++y10) {
            if (y10 % x10 == 0) {
                continue;
            } else if (y10 == 8) {
                break;
            } else {
                System.out.print(y10 + " ");
            }
        }

    }
}
