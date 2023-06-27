// Given a integer, "N", print its first 10 multiples. Each multiple "N x i" (where 1 <= i <= 10) should be printed on a new line in the format: "N x i = result".

import java.util.Scanner;

public class JavaLoopsI {
        
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();        
        scan.close();
        
        for (int value = 1; value <= 10; value++) {

            String multiple = Integer.toString(i * value);
            String value_string = Integer.toString(value);
            String i_string = Integer.toString(i);
            System.out.println(i_string + " x " + value_string + " = " + multiple);
        }

    }            

}
