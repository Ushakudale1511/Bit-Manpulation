import java.util.*;
class Bit1 {
    //update bit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int  oper =sc.nextInt();
        int n = 5;
        int pos = 1;

        if (oper == 1 ){
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        }else{
            int  newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
 