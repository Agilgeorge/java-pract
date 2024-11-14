import java.util.Scanner;

public class bina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Read the integer input
        String binaryString = Integer.toBinaryString(n);  // Get the binary representation
        String complement = "";  // Initialize the complement string
        
        // Compute the complement by flipping each bit
        for (int i = 0; i < binaryString.length(); i++) {
            char bit = binaryString.charAt(i);
            if (bit == '0') {
                complement += '1';  // Append '1' for '0'
            } else {
                complement += '0';  // Append '0' for '1'
            }
        }
        
        // Convert the binary complement string to a decimal value
        int decimalComplement = Integer.parseInt(complement, 4);
        
        // Print results
        System.out.println("Binary Representation: " + binaryString);
        System.out.println("Complement: " + complement);
        System.out.println("Decimal Value of Complement: " + decimalComplement);
    }
}
