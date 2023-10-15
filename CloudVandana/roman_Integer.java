
// Convert roman numbers to numbers  

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RomanToInteger {
    public static void Roman_Integer(String val) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int output = 0;
        int l = val.length();
        for (int i = 0; i < l; i++) {
            if (((i + 1) < l) && (m.get(val.charAt(i))) < (m.get(val.charAt(i + 1)))) {
                output = output - (m.get(val.charAt(i)));

           }else{
                output = output + (m.get(val.charAt(i)));

            }
        }
        System.out.println("The number is: " + output);

    }

    // Main Method
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Roman Number");
        String val = obj.nextLine();
        String v = val.toUpperCase();
        Roman_Integer(v);

    }
}