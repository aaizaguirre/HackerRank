// In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
// Input format: There are three lines of input:
//      The first line contains an integer.
//      The second line contains a double.
//      The third line contains a String.
// Output format: There are three lines of output:
//      On the first line, print String: followed by the unaltered String read from stdin.
//      On the second line, print Double: followed by the unaltered double read from stdin.
//      On the third line, print Int: followed by the unaltered integer read from stdin.
// Sample Input:
//      42
//      3.1415
//      Welcome to HackerRank's Java tutorials!
// Sample output:
//      String: Welcome to HackerRank's Java tutorials!
//      Double: 3.1415
//      Int: 42

import java.util.Scanner;

public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();             // nextLine() lee toda la linea completa, a diferencia de next() que solo lee la siguiente palabra hasta encontrar un espacio en blanco. 
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
