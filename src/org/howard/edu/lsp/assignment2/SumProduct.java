package org.howard.edu.lsp.assignment2;

import java.util.Scanner;
import java.util.Arrays;

public class SumProduct {

	public static void main(String[] args) {   
        Boolean test = false;
        
        while(!test) {
        	int sumTotal = 0;
        	int sumProduct = 1;
    		System.out.println("String?");
            @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
            String[] tokens = scanner.nextLine().split(" ");
            test = Arrays.asList(tokens).contains("Goodbye");
            if (test) {
            	break;
            }
            
            System.out.println("Tokens:");
            for (String i : tokens) {
            	System.out.println(i);
            	sumTotal += Integer.parseInt(i);
            	sumProduct *= Integer.parseInt(i);
            	}
                System.out.println("Sum: " +sumTotal);
                System.out.println("Product: " +sumProduct);
            }
        
        }

}

